Algoritmo CocRes
	Definir D, R, N1, N2 como real;
	Escribir "Programa para calcular el cociente y el residuo de un numero entre otro";
	Escribir "Dame el dividendo";
	Leer N1;
	Escribir "Dame el divisor";
	Leer N2;
	D<-N1/N2;
	R<-N1 MOD N2;
	Escribir "Cociente: ", D, " residuo: ", R;
FinAlgoritmo
