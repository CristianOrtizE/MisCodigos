Algoritmo ejercicio10
	Definir i, l Como Real;
	
	l=1;
	i=1;
	
	Repetir
		Escribir "---------------------- tabla de: ", l, " ----------------------";
		
		
		Para i<-1 Hasta 10 Con Paso 1 Hacer
			Escribir i, " x ", l, " = ", l*i;
		Fin Para
	
	l=l+1;
	
	Hasta Que l=6
	Escribir "--------------------------FIN TABLAS--------------------------";
FinAlgoritmo
