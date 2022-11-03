Algoritmo ejercicio17
	Definir num Como Entero;

	Escribir "Programa que muestre por pantalla el número en letras de la cara opuesta al resultado obtenido de un dado";
	Escribir "Ingrese el numero del dado: ";
	Leer num;
	Si num>=1 Y num<=6 Entonces
		Si num==1 Entonces
			Escribir "El lado opuesto es: seis";
		Fin Si
		Si num==2 Entonces
			Escribir "El lado opuesto es: cinco";
		Fin Si
		Si num==3 Entonces
			Escribir "El lado opuesto es: cuatro";
		Fin Si
		Si num==4 Entonces
			Escribir "El lado opuesto es: tres";
		Fin Si
		Si num==5 Entonces
			Escribir "El lado opuesto es: dos";
		Fin Si
		Si num==6 Entonces
			Escribir "El lado opuesto es: uno";
		Fin Si
	SiNo
		Escribir "ERROR: número incorrecto.";
	Fin Si
FinAlgoritmo
