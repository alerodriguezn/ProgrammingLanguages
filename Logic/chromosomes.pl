% CROMOSOMAS 
cromosomas(juan, [0, 1, 0, 1, 1, 0, 1, 0, 0, 1]).
cromosomas(maria, [1, 1, 0, 0, 1, 1, 0, 1, 0, 1]).
cromosomas(pedro, [0, 1, 0, 1, 1, 0, 1, 0, 0, 1]).
cromosomas(laura, [1, 1, 0, 0, 1, 1, 0, 1, 0, 1]).
cromosomas(ana, [0, 1, 0, 1, 1, 0, 1, 0, 0, 1]).
cromosomas(pablo, [1, 1, 0, 0, 1, 1, 0, 1, 0, 1]).
cromosomas(luis, [0, 1, 0, 1, 1, 0, 1, 0, 0, 1]).
cromosomas(oscar, [1, 1, 0, 0, 1, 1, 0, 1, 0, 1]).
cromosomas(roberto, [0, 1, 0, 1, 1, 0, 1, 0, 0, 1]).
cromosomas(sonia, [1, 1, 0, 0, 1, 1, 0, 1, 0, 1]).

% Muesta para comparar
muestra([1, 0, 1, 0, 1, 0, 1, 0, 1, 0]).

% Calcular la similitud entre dos listas de cromosomas
similitud([], [], 0). % La similitud entre dos listas vacías es nula o sea 0
similitud([H1|T1], [H2|T2], Similaridad) :-
    similitud(T1, T2, Tail), (H1 = H2 -> Similaridad is Tail + 1 ; Similaridad is Tail).

% Buscar la persona más parecida a la muestra
mas_similar(Persona, Similaridad) :-
    muestra(MuestraCromosomas),
    findall(OtraPersona-Sim, (cromosomas(OtraPersona, OtrosCromosomas), similitud(MuestraCromosomas, OtrosCromosomas, Sim)), ListaSimilaridades),
    max_member(Similaridad-Persona, ListaSimilaridades).

% Ejemplo para probar
% mas_similar(Personas,Similaridad).
% RESPUESTA: Personas = 3, Similaridad = sonia.
%