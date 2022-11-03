Algoritmo cambio
	definir dinCli, cosPro, camb, faltante como real;
	Escribir "Programa para calcular el cambio del cliente";
	Escribir "Ingrese la cantidad de dinero entregada por el cliente: ";
	Leer dinCli;
	Escribir "Ingrese el costo del producto: ";
	Leer cosPro;
	SI dinCli >= cosPro Entonces
		camb <- dinCli-cosPro;
		Escribir "El cambio a entregar es de: ", camb, " ARS";
	SiNo
		faltante<- cosPro-dinCli;
		Escribir "Faltan: ", faltante, " ARS";
	FinSi
FinAlgoritmo
