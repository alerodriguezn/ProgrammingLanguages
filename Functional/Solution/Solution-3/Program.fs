let getNthElement n lista =
    let idxs = [0..List.length lista - 1]
    let idxList = List.zip idxs lista
    let elem = List.choose (fun (i, v) -> if i = n then Some v else None) idxList
    match elem with
    | [x] -> x
    | _ -> failwith "Index out of range"


let r1 =  getNthElement 2 [1;2;3;4;5]
printfn "%A" r1

let r2 =  getNthElement 3 [1;2;3;4;5]
printfn "%A" r2