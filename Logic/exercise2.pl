% [] es subconjunto de TODO
subconj([], _).


subconj([X|T], S) :- member(X, S), subconj(T, S).


% Ejemplo: subconj([b], [a, b]). Daría True