Algoritmo ejercicio18
	Definir c1, c2, c3, cade como texto;
	
	Escribir "Ingrese su nombre: ";
	Leer c1;
	Escribir "Ingrese su primer apellido: ";
	Leer c2;
	Escribir "Ingrese su segundo apellido: ";
	Leer c3;
	
	cade=subcadena(c1,0,0);
	Escribir "La inicial de su nombre es: ", cade;
	cade=subcadena(c2,0,0);
	Escribir  "La inicial de su primer apellido es: ",cade;
	cade=subcadena(c3,0,0);
	Escribir  "La inicial de su segundo apellido es: ",cade;
FinAlgoritmo
