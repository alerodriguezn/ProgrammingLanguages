let get_substrings (substr: string) (lista: string list) =
    let sub (s: string) = s.Contains(substr)
    List.filter sub lista



let r1 = get_substrings "la" ["la casa"; "el perro"; "pintando la cerca"]

printfn "%A" r1