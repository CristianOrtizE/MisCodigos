Algoritmo actividad9
	Definir x, med, sum, i como real;
	Escribir "Programa que pida números hasta que se introduzca un cero."; 
	Escribir "Luego mostrar la suma y la media de todos los números introducidos";
	i=0;
	sum=0;
	Repetir
			Escribir "Ingrese un numero: ";
			Leer x;
			Si x <> 0 Entonces
				sum<-sum+x;
				i=i+1;
			FinSi
	Hasta Que x=0;
	med<-sum/i;
	Escribir "Suma: ", sum, " media: ", med;	
FinAlgoritmo
