Algoritmo areasFiguras
	Definir n1, n2, r, option Como Real;
	Escribir "Programa para calcular areas de figuras:";
	Escribir "Por favor seleccione su opcion:";
	Escribir "Opcion 1: Area de un cuadrado:";
	Escribir "Opcion 2: Area de un rectangulo:";
	Escribir "Opcion 3: Area de un triangulo:";
	Leer option;
	Segun option hacer
		1:
			Escribir "Para calcular el area de su cuadrado: ingrese la medida de un lado:";
			Leer n1;
			r<-n1^2;
			Escribir "Su area es de: ", r;
		2:
			Escribir "Para calcular el area de su rectangulo: ingrese la medida de los lados:";
			Leer n1;
			Leer n2;
			r<-n1*n2;
			Escribir "Su area es de: ", r;
		3: 
			Escribir "Para calcular el area de su triangulo: ingrese la medida de base y altura:";
			Leer n1;
			Leer n2;
			r<-(n1*n2)/2;
			Escribir "Su area es de: ", r;
			
		De Otro Modo:
			Escribir "El numero ingresado no es valido";
	FinSegun
	
FinAlgoritmo
