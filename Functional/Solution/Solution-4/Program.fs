open RutaCorta

let rutas = prof2 "i" "f" grafo 

let todas_las_rutas = rutas
printfn "Todas las rutas:"
for ruta in todas_las_rutas do
    printfn "%A" ruta
printfn "--------------------"
printfn "Respectivos pesos:"
let pesos = medicion rutas grafo
for peso in pesos do
        printfn "Peso: %d" peso
        


