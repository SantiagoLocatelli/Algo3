" 7507/9502 | 2018 2C | TP0 | Enunciado 2 "

| error ccp expediente1 expediente2 expediente3 estado votos |

Transcript clear.
error := false.

ccp := ComisionCurricularPermanente new.

expediente1 := Expediente new.
expediente1 establecerNombre: 'Equivalencias'.

estado := expediente1 estado.
(estado = 'Iniciado') ifFalse: [
    Transcript show: 'Error. El expediente 1 esta en tramite.' ; cr.
    error := true.
].

ccp recibirExpediente: expediente1.

expediente2 := Expediente new.
expediente2 establecerNombre: 'Robar creditos'.

estado := expediente2 estado.
(estado = 'Iniciado') ifFalse: [
    Transcript show: 'Error. El expediente 2 esta en tramite.' ; cr.
    error := true.
].

ccp recibirExpediente: expediente2.

expediente3 := Expediente new.
expediente3 establecerNombre: 'Excepcion de correlatividad'.

estado := expediente3 estado.
(estado = 'Iniciado') ifFalse: [
    Transcript show: 'Error. El expediente 3 esta en tramite.' ; cr.
    error := true.
].

ccp recibirExpediente: expediente3.

" Tratamiento del primer expediente. "
ccp votarAFavor.   " Voto de un integrante de la CC. "
ccp votarEnContra. " Voto de otro integrante de la CC. "
ccp votarAFavor.   " Voto de otro integrante de la CC. "

expediente1 := ccp procesarExpediente. " Devuelve el primer expediente con el estado actualizado. "

estado := expediente1 estado.
(estado = 'Aprobado') ifFalse: [
    Transcript show: 'Error. El expediente 1 fue aprobado por la CC.' ; cr.
    error := true.
].

votos := expediente1 votosAFavor.
(votos = 2) ifFalse: [
    Transcript show: 'Error. El expediente 1 recibio dos votos positivos.' ; cr.
    error := true.
].

votos := expediente1 votosEnContra.
(votos = 1) ifFalse: [
    Transcript show: 'Error. El expediente 1 recibio un voto negativo.' ; cr.
    error := true.
].

" Tratamiento del segundo expediente. "
ccp votarEnContra. " Voto de un integrante de la CC. "
ccp votarEnContra. " Voto de otro integrante de la CC. "
ccp votarEnContra. " Voto de otro integrante de la CC. "

expediente2 := ccp procesarExpediente. " Devuelve el segundo expediente con el estado actualizado. "

estado := expediente2 estado.
(estado = 'Rechazado') ifFalse: [
    Transcript show: 'Error. El expediente 2 no fue aprobado por la CC.' ; cr.
    error := true.
].

votos := expediente2 votosAFavor.
(votos = 0) ifFalse: [
    Transcript show: 'Error. El expediente 2 no recibio votos positivos.' ; cr.
    error := true.
].

votos := expediente2 votosEnContra.
(votos = 3) ifFalse: [
    Transcript show: 'Error. El expediente 2 recibio tres votos negativos.' ; cr.
    error := true.
].

" Tratamiento del tercer expediente. "
ccp votarEnContra. " Voto de un integrante de la CC. "
ccp votarEnContra. " Voto de otro integrante de la CC. "
ccp votarAFavor.   " Voto de otro integrante de la CC. "

expediente3 := ccp procesarExpediente. " Devuelve el tercer expediente con el estado actualizado. "

estado := expediente3 estado.
(estado = 'Rechazado') ifFalse: [
    Transcript show: 'Error. El expediente 3 no fue aprobado por la CC.' ; cr.
    error := true.
].

votos := expediente3 votosAFavor.
(votos = 1) ifFalse: [
    Transcript show: 'Error. El expediente 3 recibio un voto positivo.' ; cr.
    error := true.
].

votos := expediente3 votosEnContra.
(votos = 2) ifFalse: [
    Transcript show: 'Error. El expediente 3 recibio dos votos negativos.' ; cr.
    error := true.
].

" Resultado final. "
error ifTrue: [  
	Transcript show: 'Resultado final: ERROR'.
]
ifFalse: [
	Transcript show: 'Resultado final: OK'.
].
