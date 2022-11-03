Algoritmo Balanza
	Definir precioKg,peso,dinEntregado Como Real;
	Escribir 'Ingrese el precio por kg del articulo: ';
	Leer precioKg;
	Escribir 'Ingrese el peso del articulo: ';
	Leer peso;
	Escribir 'Ingrese el dinero entregado por el cliente: ';
	Leer dinEntregado;
	
	Definir precio, vuelto Como Real;
	
	precio <- peso*precioKg;
	vuelto <- dinEntregado-precio;
	
	Escribir 'El precio a pagar es: $',precio,' y el vuelto que debe darle al cliente es: $',vuelto;
FinAlgoritmo
