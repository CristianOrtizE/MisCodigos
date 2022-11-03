Algoritmo ejercicio9
	Definir n1, n2, n3 Como Real;
	Escribir "Ingrese los numeros a ordenar:";
	Leer n1, n2, n3;
	Si n1 > n2 Entonces
		Si n2 > n3 Entonces
			Escribir "Los numeros ordenados son: " n3," ", n2, " ", n1;
		SiNo
			Si n1 > n3 Entonces
				Escribir "Los numeros ordenados son: " n2, " ", n3, " ", n1;
			SiNo
				Escribir "Los numeros ordenados son: " n2, " ", n1, " ", n3;
			Fin Si
		Fin Si
	SiNo
		Si n1 > n3 Entonces
			Escribir "Los numeros ordenados son: " n3, " ", n1, " ", n2;
		SiNo
			Si n2 > n3 Entonces
				Escribir "Los numeros ordenados son: " n1," ",  n3, " ", n2;
			SiNo
				Escribir "Los numeros ordenados son: " n1," ",  n2, " ", n3;
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
