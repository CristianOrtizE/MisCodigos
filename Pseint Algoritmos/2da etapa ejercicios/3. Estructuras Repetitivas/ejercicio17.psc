Algoritmo ejercicio17
	Definir horTra, i, cantDias, idi como entero;
	Definir sumSue, cantEmpl, precHor, precEmp Como Real;
	sumSue=0;
	i=0;
	idi=0;
	Escribir "Por favor ingrese la cantidad de empleados a liquidar: ";
	Leer cantEmpl;
	Escribir "Ingrese el precio hora de la liquidacion: ";
	Leer precHor;
	Para i<-0 Hasta cantEmpl-1 Con Paso 1 Hacer
		Escribir "Ingrese la cantidad de dias trabajados en la semana del empleado ", i+1;
		Leer cantDias;
		Para idi<-0 Hasta cantDias-1 Con Paso 1 Hacer
		Escribir "Ingrese la cantidad de horas trabajadas en el dia ", idi+1;
		Leer horTra;
		precEmp<-precHor*horTra;
		sumSue<-sumSue+precEmp;
	FinPara
	FinPara
	
	
	Escribir "La suma de los sueldos a pagar en el mes es: $", sumSue;
FinAlgoritmo
