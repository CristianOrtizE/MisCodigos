Algoritmo ejercicio18
	Definir num Como Entero;
	
	Escribir "programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el mes correspondie";
	Escribir "Ingrese el numero del mes: ";
	Leer num;
	Si num>=1 Y num<=12 Entonces
		Segun num Hacer
			1:
				Escribir "El mes tiene 31 d�as";
			2:
				Escribir "El mes tiene 28 d�as";
			3:
				Escribir "El mes tiene 31 d�as";
			4:
				Escribir "El mes tiene 30 d�as";
			5: 
				Escribir "El mes tiene 31 d�as";
			6:
				Escribir "El mes tiene 30 d�as";
			7:	
				Escribir "El mes tiene 31 d�as";
			8:
				Escribir "El mes tiene 31 d�as";
			9:
				Escribir "El mes tiene 30 d�as";
			10:
				Escribir "El mes tiene 31 d�as";
			11:
				Escribir "El mes tiene 30 d�as";
			12:
				Escribir "El mes tiene 31 d�as";
		Fin Segun
	SiNo
		Escribir "ERROR: n�mero incorrecto.";
	Fin Si
FinAlgoritmo