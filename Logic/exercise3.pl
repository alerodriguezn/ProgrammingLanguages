% Aplanar una lista vacía devuelve una lista vacía.
aplanar([], []).

% Caso Aplanar cabeza y Cola
aplanar([Head | T], L2) :-
    is_list(Head),
    aplanar(Head, H2),
    aplanar(T, T2),
    append(H2, T2, L2).

% Aplanar la cola si la cabeza no es lista
aplanar([Head | T], [Head | T2]) :- \+ is_list(Head), aplanar(T, T2).

% Ejemplo para probar aplanar([1, [2, 8], [4, [5, 6]]], L)
% Respuesta: L = [1, 2, 8, 4, 5, 6]