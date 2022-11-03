Algoritmo ejercicio1
	Definir var1, conta, factorial como real;
	Escribir "Ingrese un numero y se calculara su factorial";
	factorial=1;
	conta = 1;
	Leer var1;
	Mientras conta<var1 Hacer
		conta=conta+1;
		factorial=factorial*conta;
	Fin Mientras
	Escribir "Su numero factorial es: ", factorial;
FinAlgoritmo
