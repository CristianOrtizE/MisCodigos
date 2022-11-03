Algoritmo ejercicio11
	Definir lado1, lado2, lado3 como real;
	Escribir "Ingrese su lado A, B y C";
	Leer lado1;
	Leer lado2;
	Leer lado3;
	
	Si lado1^2 == lado2^2 + lado3^2 Entonces
		Escribir "Es un triangulo rectangulo";
	SiNo
		Si lado1 == lado2 Y lado2 == lado3 Entonces
			Escribir "Es un angulo Equilatero";
	SiNo
		Si lado1 == lado2 O lado1 == lado3 O lado3 == lado2  Entonces
		Escribir "Es un angulo Isoseles";
	SiNo
		Escribir "Es un angulo Escaleno";
	Fin Si
	Fin Si
	Fin Si
FinAlgoritmo
