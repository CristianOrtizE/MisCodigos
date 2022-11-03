Algoritmo actividad2
	Definir c, oc, x Como Real;
	Escribir "Programa que indica digitos a la izquierda de un numero:";
	Escribir "Dame dato: ";
	Leer x;
	c<-0;
	Repetir
		x<- x / 10;
		c<- c + 1;
	Hasta Que x<1
	Escribir "Digitos a la izquierda: ", c;
FinAlgoritmo
