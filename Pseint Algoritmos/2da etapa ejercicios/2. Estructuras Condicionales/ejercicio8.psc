Algoritmo ejercicio8
	Definir nota, edad como real;
	Definir sexo Como Caracter;
	Escribir "Ingrese la nota:";
	Leer nota;
	Escribir "Ingrese la edad:";
	Leer edad;
	Escribir "Ingrese el sexo: F: Femenino M: Masculino";
	Leer sexo;
	
	Si nota>=5 Y edad>=18 Y sexo="F" Entonces
		Escribir "ACEPTADA";
	SiNo
		Si nota>=5 Y edad>=18 Y sexo="M" Entonces
			Escribir "POSIBLE";
		SiNo
			Escribir "NO ACEPTADA";
		Fin Si
	Fin Si
	
FinAlgoritmo
