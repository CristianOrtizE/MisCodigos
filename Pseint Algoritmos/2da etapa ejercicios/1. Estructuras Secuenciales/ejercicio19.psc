Algoritmo ejercicio19
	Definir nota, acum Como Real;
	acum=0;
	Repetir
		Escribir "Ingrese 1 si la nota fue correcta: ";
		Escribir "Ingrese 2 si la nota fue incorrecta: ";
		Escribir "Ingrese 3 si la nota fue en blanco: ";
		Escribir "Ingrese 0 para salir del programa: ";
		Leer nota;

		Segun nota Hacer
			0:
				Escribir "Saliendo del algoritmo en instantes le brindaremos la nota final: ";
			1:	
				acum=acum+5;
			2:
				acum=acum-1;
			3:
				acum=acum;
			De Otro Modo:
			Escribir "Nota invalida, ingrese una de las opciones y salga presionando 0";
		Fin Segun
	Hasta Que nota=0
	
	Escribir "La nota final del alumno fue de: ", acum;
FinAlgoritmo
