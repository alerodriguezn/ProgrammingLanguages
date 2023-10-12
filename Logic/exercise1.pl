sumlist([], 0).  %Caso lista vacia

sumlist([Ini|Fin], Total) :- sumlist(Fin, TSum),  Total is Ini + TSum.

% Ejemplo para probar
% sumlist([1,2,3], S). Daría 6
% sumlist([1,2], S). Daría 3
