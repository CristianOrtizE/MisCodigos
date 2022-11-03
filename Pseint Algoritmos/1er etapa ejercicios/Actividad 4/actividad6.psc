Algoritmo actividad6
	Definir p, n, i, x  Como Real;
	Escribir "programa que indica positivos y negativos de un conjunto de 25 datos";
	p<-0;
	n<-0;
	i<-1;
	Para i=1 Hasta 25 Con Paso 1 Hacer
		Escribir "Dame un numero: ";
		Leer x;
		Si x<0 Entonces
			n<-n+1;
		FinSi
		si x>0 Entonces
			p<-p+1;
		FinSi
	Fin Para
	Escribir "Los positivos son: ", p, " los negativos son: ", n;
FinAlgoritmo
