Algoritmo ejercicio2
	Definir num, i, var1 como real;
	Escribir "Juguemos a adivinar el numero del 1 al 100 - Tenés 10 intentos";
	i = 0;
	var1 = azar(100);
	Repetir
		i = i +1;
		Leer num;
		Si num = var1 Entonces
			Escribir "Acertaste, felicitaciones";
		SiNo
			Escribir "Te quedan: ", 10-i, " intentos";
		Si num <> var1 y num < var1 Entonces
			Escribir "El numero ingresado es menor al numero aleatorio";
		SiNo
			Escribir "El numero ingresado es mayor al numero aleatorio";
		Fin Si
		Fin Si
	Mientras Que var1 <> num y i < 10
	
	Escribir "El numero era: " var1;
	
FinAlgoritmo
