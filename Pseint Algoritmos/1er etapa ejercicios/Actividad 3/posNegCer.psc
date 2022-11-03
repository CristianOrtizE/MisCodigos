Algoritmo posNegCer
	Definir a, b, sum como real;
	Escribir "Programa para encontrar la suma de dos numeros e indicar si es positivo, negativo o cero";
	Escribir "Ingrese los numeros";
	Leer a;
	Leer b;
	sum<-a+b;
	Si sum>0 Entonces
		Escribir "Suma= ", sum, " y es positiva";
	FinSi
	Si sum<0 Entonces
		Escribir "Suma= ", sum, " y es negativa";
	FinSi
	Si sum=0 Entonces
		Escribir "Suma= ", sum, " es igual a 0";
	FinSi
FinAlgoritmo
