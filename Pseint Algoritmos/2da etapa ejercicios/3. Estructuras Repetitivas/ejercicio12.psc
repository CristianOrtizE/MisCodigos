Algoritmo ejercicio12
	Definir acu, num, i como real;
	Escribir "Este programa Le solicitar� su ahorro mensual y le dir� cuanto ahorro en el a�o completo";
	acu=0;
	
	Para i<-1 Hasta 12 Con Paso 1 Hacer
		Escribir "Ingrese el monto ahorrado en el mes ", i;
		Leer num;
		acu=acu+num;
		Escribir "El monto ahorrado hasta el mes ", i, " es de: ", acu;
	Fin Para
	
	
	Escribir "El monto ahorrado total es entonces: ", acu;
FinAlgoritmo
