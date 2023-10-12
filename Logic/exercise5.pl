% Cada contiene sub
cont(Cadena, Subcadena) :- sub_string(Cadena, _, _, _, Subcadena).

% Caso base: lista vacía
inc_sub(_, [], []).

% Contiene la subcadena
inc_sub(Subcadena, [Cabeza|Resto], [Cabeza|Filtradas]) :-
    cont(Cabeza, Subcadena),
    inc_sub(Subcadena, Resto, Filtradas).

% No contiene la subcadena
inc_sub(Subcadena, [Cabeza|Resto], Filtradas) :- \+ cont(Cabeza, Subcadena), inc_sub(Subcadena, Resto, Filtradas).

sub_cadenas(Subcadena, Lista, Filtradas) :- inc_sub(Subcadena, Lista, Filtradas).


% Probar con sub_cadenas("la", ["la casa", "el perro", "pintando la cerca"], Filtradas).