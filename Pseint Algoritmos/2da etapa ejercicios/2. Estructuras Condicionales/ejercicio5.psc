Algoritmo ejercicio5
	Definir usu, cont, var1, var2 como caracter;
	usu = "pepe";
	cont = "asdasd";
	Escribir "Ingrese su usuario y contraseña: ";
	Leer var1;
	Leer var2;
	
	Si var1 = usu Entonces
		Si var2 = cont Entonces
			Escribir "Has ingresado a Evelia";
		Fin Si
	SiNo
		Escribir "Tu usuario o contraseña están mal, vuelve a intentar:";
	Fin Si
	
FinAlgoritmo
