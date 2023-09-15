let shift (dir:string) (n:int) (lista:int list) =
    let length = List.length lista
    match dir with
    | "der" ->
        let takeCount = min n length
        let dropCount = length - takeCount
        let shifted = List.init length (fun i -> if i < takeCount then 0 else List.nth lista (i - takeCount))
        shifted
    | "izq" ->
        let takeCount = min n length
        let shifted = List.init length (fun i -> if i < length - takeCount then List.nth lista (i + takeCount) else 0)
        shifted
    

let numList = [1;2;3;4;5]

let r1 = shift "izq" 3  numList
printfn "%A" r1

let r2 = shift "der" 2  numList
printfn "%A" r2

let r3 = shift "izq" 6  numList
printfn "%A" r3