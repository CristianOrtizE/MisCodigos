Algoritmo ejercicio12
	Definir n1 como Real;
	Escribir "Ingrese un a�o y le dir� si es bisiesto o no";
	Leer n1;
	Si n1 MOD 4 == 0 Y n1 MOD 100 <> 0 O n1 MOD 400 == 0 Entonces
				Escribir "El a�o ",n1 ," es bisiesto";
			SiNo
				Escribir "No es un a�o bisiesto";
	Fin Si
FinAlgoritmo
