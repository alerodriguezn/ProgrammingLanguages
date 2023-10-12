% Base
partir([], _ , [], []).

% Primer miembro es mayor que el umbral.
partir([X | T], Umbral, Menores, [X | Mayores]) :-
    X > Umbral,
    partir(T, Umbral, Menores, Mayores).

% Primer miembro es menor o igual que el umbral.
partir([X | T], Umbral, [X | Menores], Mayores) :-
    X =< Umbral,
    partir(T, Umbral, Menores, Mayores).

% Ejemplo para probar partir([2,7,4,8,9,1], 6, Menores, Mayores).
% Respuesta: Menores = [2,4,1], Mayores = [7,8,9].