Algoritmo ejercicio12
	Definir n1 como Real;
	Escribir "Ingrese un año y le diré si es bisiesto o no";
	Leer n1;
	Si n1 MOD 4 == 0 Y n1 MOD 100 <> 0 O n1 MOD 400 == 0 Entonces
				Escribir "El año ",n1 ," es bisiesto";
			SiNo
				Escribir "No es un año bisiesto";
	Fin Si
FinAlgoritmo
