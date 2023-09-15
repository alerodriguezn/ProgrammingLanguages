module RutaCorta

open Recipientes
// Grafo de prueba


let grafo = [
    ("i", ["a"; "b"], ["2"; "4"]);
    ("a", ["i"; "c"; "d"], ["5"; "6"; "7"]);
    ("b", ["i"; "c"; "d"], ["4"; "6"; "8"]);
    ("c", ["a"; "b"; "x"], ["6"; "6"; "4"]);
    ("d", ["a"; "b"; "f"], ["2"; "2"; "6"]);
    ("f", ["d"], ["2"]);
    ("x", ["c"], ["5"])
]


// Función para generar vecinos
let rec vecinos nodo grafo =
    match grafo with
    | [] -> []
    | (head, neighbors, _)::rest ->
        if head = nodo then neighbors
        else vecinos nodo rest

// Función para extender una ruta
let extender (ruta) (grafo) = 
    List.filter
        (fun x -> x <> [])
        (List.map  (fun x -> if (miembro x ruta) then [] else x::ruta) (vecinos (List.head ruta) grafo)) 

// Función principal de búsqueda en profundidad

let rec prof2 (ini) (fin) (grafo) =
    let rec prof_aux (fin) (ruta) (grafo) =
        if List.isEmpty ruta then []
        elif (List.head (List.head ruta)) = fin then
            List.rev (List.head ruta) :: prof_aux fin ((extender (List.head ruta) grafo) @ (List.tail ruta)) grafo       
        else
            prof_aux fin ((List.tail ruta) @ (extender (List.head ruta) grafo)) grafo
    prof_aux fin [[ini]] grafo


