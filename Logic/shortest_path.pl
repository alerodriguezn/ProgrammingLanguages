% Con pesos
conectado(i, b, 2).
conectado(a, b, 4).
conectado(a, c, 5).
conectado(b, f, 3).
conectado(b, c, 2).
conectado(c, f, 4).

conectados(X, Y, P) :- conectado(X, Y, P).
conectados(X, Y, P) :- conectado(Y, X, P).

ruta(Ini, Fin, Ruta, Peso) :- ruta2(Ini, Fin, [], Ruta, 0, Peso). 

 
ruta2(Fin, Fin, _, [Fin], Peso, Peso).  
ruta2(Ini, Fin, Visitados, [Ini | Resto], PesoActual, PesoTotal) :-
    conectados(Ini, Alguien, P),  not(member(Alguien, Visitados)), PesoNuevo is PesoActual + P, 
    ruta2(Alguien, Fin, [Ini | Visitados], Resto, PesoNuevo, PesoTotal).

% Probar con ruta(i, f, Ruta, Peso).
% Respuesta: Ruta = [i, b, f], Peso = 5