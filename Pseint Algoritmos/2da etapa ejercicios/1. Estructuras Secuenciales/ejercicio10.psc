Algoritmo ejercicio10
	Definir ep1, ep2, ep3, ef1, tf1, profi como real;
	Escribir "Ingrese las 3 notas de los parciales del alumno: ";
	Leer ep1;
	Leer ep2;
	Leer ep3;
	Escribir "Ingrese la nota del examen final del alumno ";
	Leer ef1;
	Escribir "Ingrese la nota del trabajo final del alumno ";
	Leer tf1;
	
	profi<-+(((ep1+ep2+ep3)/3)*55/100)+ef1*30/100+tf1*15/100;
	Escribir "Su promedio final es de: " profi;
	
FinAlgoritmo
