Algoritmo ejercicio18
	Definir num Como Entero;
	
	Escribir "programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondie";
	Escribir "Ingrese el numero del mes: ";
	Leer num;
	Si num>=1 Y num<=12 Entonces
		Segun num Hacer
			1:
				Escribir "El mes tiene 31 días";
			2:
				Escribir "El mes tiene 28 días";
			3:
				Escribir "El mes tiene 31 días";
			4:
				Escribir "El mes tiene 30 días";
			5: 
				Escribir "El mes tiene 31 días";
			6:
				Escribir "El mes tiene 30 días";
			7:	
				Escribir "El mes tiene 31 días";
			8:
				Escribir "El mes tiene 31 días";
			9:
				Escribir "El mes tiene 30 días";
			10:
				Escribir "El mes tiene 31 días";
			11:
				Escribir "El mes tiene 30 días";
			12:
				Escribir "El mes tiene 31 días";
		Fin Segun
	SiNo
		Escribir "ERROR: número incorrecto.";
	Fin Si
FinAlgoritmo