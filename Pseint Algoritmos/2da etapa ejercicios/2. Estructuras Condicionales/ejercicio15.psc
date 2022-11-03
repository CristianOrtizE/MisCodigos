Algoritmo ejercicio15
	Definir alumnos como entero;
	Escribir "Ingrese la cantidad de alumnos que viajarán:";
	Leer alumnos;
	
	Si alumnos>=100 Entonces
		Escribir "Cada alumno deberá pagar $65"; 
	SiNo
		Si alumnos<100 Y alumnos>49 Entonces
			Escribir "Cada alumno deberá pagar $70"; 
		SiNo
			Si alumnos<50 Y alumnos>29 Entonces
				Escribir "Cada alumno deberá pagar $95"; 
			SiNo
				Escribir "Cada alumno deberá pagar $", 4000/alumnos;
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
