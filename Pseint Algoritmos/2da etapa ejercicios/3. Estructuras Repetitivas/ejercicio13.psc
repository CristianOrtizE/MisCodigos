Algoritmo ejercicio13
	Definir horas, sueldo, i, acu, precio como real;
	Escribir "Este programa le solicitará las horas trabajadas por dia y calculará el sueldo"; 
	acu=0;
	i=0;
	
	Para i<-1 Hasta 6 Con Paso 1 Hacer
		Escribir "Ingrese las horas trabajadas el dia: ", i;
		Leer horas;
		acu=acu+horas;
	Fin Para
	
	Escribir "Ingrese el precio por hora del empleado";
	Leer precio;
	sueldo=precio*acu;
	Escribir "El empleado cobrará: $", sueldo;
FinAlgoritmo
