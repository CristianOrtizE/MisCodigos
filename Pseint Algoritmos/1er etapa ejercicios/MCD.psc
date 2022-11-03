Algoritmo MCD
	Definir n1, n2, div1, maximo como entero;
	Escribir "Ingresa 2 numeros";
	Leer n1, n2;
	Si n1>0 y n2>0 Entonces
		maximo=1;
		div1=1;
		Mientras div1 <=	 n1 hacer
			si n1 mod div1 = 0 y n2 mod div1 = 0 Entonces
				si div1 > maximo Entonces
					maximo = div1;
				FinSi
			FinSi
			div1 = div1 + 1;
		FinMientras
		Escribir "El maximo comun divisor es: ", maximo;
	SiNo
		Escribir "Debes ingresar numeros mayores a cero";
	FinSi
FinAlgoritmo
