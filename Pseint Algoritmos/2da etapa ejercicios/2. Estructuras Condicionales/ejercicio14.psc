Algoritmo ejercicio14
	Definir cantidad, precio, prA1, prA2, prB1, prB2, acu Como Real;
	Escribir "Ingrese el precio por kg de UVA";
	Leer precio;
	prA1=precio+0.2;
	prA2=precio+0.3;
	prB1=precio-0.3;
	prB2=precio-0.5;
	
	Escribir "Ingrese la cantidad de UVA tipo A1 vendida: "; 
	Leer cantidad;
	acu=cantidad*prA1;
	Escribir "Ingrese la cantidad de UVA tipo A2 vendida: ";
	Leer cantidad;
	acu=acu+(cantidad*prA2);
	Escribir "Ingrese la cantidad de UVA tipo B1 vendida: ";
	Leer cantidad;
	acu=acu+(cantidad*prB1);
	Escribir "Ingrese la cantidad de UVA tipo B2 vendida: "; 
	Leer cantidad;
	acu=acu+(cantidad*prB2);
	
	
	Escribir "La ganancia total es: $", acu;
	
FinAlgoritmo
