module RutaCorta

// Función para verificar si un elemento está en una lista RECIPIENTES.FS
let miembro elem lista =
    List.exists (fun x -> x = elem) lista

let INICIO = 0
let FINAL = -1

let lab1 = [(INICIO, [2]);
    (1, [7]); 
    (2, [3; 8; INICIO]); 
    (3, [2; 4; 9]); 
    (4, [3; 10]); 
    (5, [6; 11]); 
    (6, [5]); 
    (7, [1; 13]);
    (8, [9; 2]);
    (9, [3; 8]); 
    (10, [4; 16]); 
    (11, [5; 17]); 
    (12, [18]);
    (13, [7; 14]); 
    (14, [13; 15; 20]); 
    (15, [14; 21]);
    (16, [10; 22]);
    (17, [11; 23]); (18, [12; 24]);
    (19, [25]); 
    (20, [14; 26]); 
    (21, [15; 22]);
    (22, [21; 16]); 
    (23, [17; 29]); 
    (24, [18; 30]);
    (25, [19; 31]); 
    (26, [20; 27]); 
    (27, [26; 28]);
    (28, [27; 29; 34]); 
    (29, [23; 28]); 
    (30, [24; 36]);
    (31, [25; 32]); 
    (32, [31; FINAL ; 33;]); 
    (33, [32; 34]);
    (34, [28; 33; 35]); 
    (35, [34;36 ]); 
    (36, [30; 35]);
    (FINAL, [32])
]

// INICIANDO EN 1 Y TERMINANDO EN 19
let lab2 = [(INICIO, [1]);
    (1, [7; INICIO]); 
    (2, [3; 8;]); 
    (3, [2; 4; 9]); 
    (4, [3; 10]); 
    (5, [6; 11]); 
    (6, [5]); 
    (7, [1; 13]);
    (8, [9; 2]);
    (9, [3; 8]); 
    (10, [4; 16]); 
    (11, [5; 17]); 
    (12, [18]);
    (13, [7; 14]); 
    (14, [13; 15; 20]); 
    (15, [14; 21]);
    (16, [10; 22]);
    (17, [11; 23]); (18, [12; 24]);
    (19, [25; FINAL]); 
    (20, [14; 26]); 
    (21, [15; 22]);
    (22, [21; 16]); 
    (23, [17; 29]); 
    (24, [18; 30]);
    (25, [19; 31]); 
    (26, [20; 27]); 
    (27, [26; 28]);
    (28, [27; 29; 34]); 
    (29, [23; 28]); 
    (30, [24; 36]);
    (31, [25; 32]); 
    (32, [31; 33;]); 
    (33, [32; 34]);
    (34, [28; 33; 35]); 
    (35, [34;36 ]); 
    (36, [30; 35]);
    (FINAL, [19])
]

// ELIMINANDO PARED DEL 13 CON EL 19
let lab3 = [(INICIO, [1]);
    (1, [7; INICIO]); 
    (2, [3; 8;]); 
    (3, [2; 4; 9]); 
    (4, [3; 10]); 
    (5, [6; 11]); 
    (6, [5]); 
    (7, [1; 13]);
    (8, [9; 2]);
    (9, [3; 8]); 
    (10, [4; 16]); 
    (11, [5; 17]); 
    (12, [18]);
    (13, [7; 14; 19]); 
    (14, [13; 15; 20]); 
    (15, [14; 21]);
    (16, [10; 22]);
    (17, [11; 23]); (18, [12; 24]);
    (19, [25; FINAL]); 
    (20, [14; 26]); 
    (21, [15; 22]);
    (22, [21; 16]); 
    (23, [17; 29]); 
    (24, [18; 30]);
    (25, [19; 31]); 
    (26, [20; 27]); 
    (27, [26; 28]);
    (28, [27; 29; 34]); 
    (29, [23; 28]); 
    (30, [24; 36]);
    (31, [25; 32]); 
    (32, [31; 33;]); 
    (33, [32; 34]);
    (34, [28; 33; 35]); 
    (35, [34;36 ]); 
    (36, [30; 35]);
    (FINAL, [19])
]


// Función para generar vecinos
let rec vecinos nodo grafo =
    match grafo with
    | [] -> []
    | (head, neighbors) :: rest ->
        if head = nodo then neighbors
        else vecinos nodo rest

// Función para extender una ruta
let extender ruta grafo = 
    List.filter
        (fun x -> x <> [])
        (List.map  (fun x -> if (miembro x ruta) then [] else x::ruta) (vecinos (List.head ruta) grafo)) 

// Función principal de búsqueda en profundidad
let rec prof2 ini fin grafo =
    let rec prof_aux fin ruta grafo =
        if List.isEmpty ruta then []
        elif (List.head (List.head ruta)) = fin then
            List.rev (List.head ruta) //:: prof_aux fin ((extender (List.head ruta) grafo) @ (List.tail ruta)) grafo       
        else
            prof_aux fin ((List.tail ruta) @ (extender (List.head ruta) grafo)  ) grafo
    prof_aux fin [[ini]] grafo


// ELIMINE EL COMENTARIO SI DESEA VER TODOS LOS CAMINOS
let r1 = prof2 INICIO FINAL lab1
printfn "Solucion(RUTA CORTA): %A" r1

// ELIMINE EL COMENTARIO SI DESEA VER TODOS LOS CAMINOS
let r2 = prof2 INICIO FINAL lab2
printfn "Solucion(RUTA CORTA): %A" r2

// ELIMINE EL COMENTARIO SI DESEA VER TODOS LOS CAMINOS
let r3 = prof2 INICIO FINAL lab3
printfn "Solucion(RUTA CORTA): %A" r3




