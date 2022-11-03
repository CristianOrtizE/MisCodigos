Algoritmo ejercicio20
	Definir moneda, acum como real;
	acum=0;
	
	Escribir "Ingrese cuantas monedas tiene de 2$: ";
	Leer moneda;
	acum=acum+moneda*2;
	Escribir "Ingrese cuantas monedas tiene de 1$: ";
	Leer moneda;
	acum=acum+moneda*1;
	Escribir "Ingrese cuantas monedas tiene de 0.50$: ";
	Leer moneda;
	acum=acum+moneda*0.5;
	Escribir "Ingrese cuantas monedas tiene de 0.20$: ";
	Leer moneda;
	acum=acum+moneda*0.20;
	Escribir "Ingrese cuantas monedas tiene de 0.10$: ";
	Leer moneda;
	acum=acum+moneda*0.10;
	Escribir "Usted tiene: ", acum, "$";
FinAlgoritmo
