Algoritmo actividad10
	Definir ltr como caracter;
	Escribir "Programa que pida caracteres e imprima VOCAL si son vocales y NoVOCAL en caso contrario";
	Repetir
		Escribir "Ingrese un caracter para evaluar si es vocal o ingrese un espacio para salir";
		Leer ltr;
		Si ltr = "a" o ltr = "e" o ltr = "i" o ltr = "o" o ltr = "u" Entonces
			Escribir "Es vocal";
		SiNo
			Escribir "No es vocal";
		FinSi
	Hasta Que ltr = " "
	
FinAlgoritmo
