Algoritmo ejercicio20
	Definir dest, peso, precio como real;
	Escribir "Programa para calculo de costo de envio internacional";
	Escribir "Por favor seleccione la opcion de destino de su envio:";
	Escribir "Opcion 1: America del Norte";
	Escribir "Opcion 2: America Central";
	Escribir "Opcion 3: America del Sur";
	Escribir "Opcion 4: Europa";
	Escribir "Opcion 5: Asia";
	Leer dest;
	Segun dest Hacer
		1:
			precio=24;
		2:
			precio=20;
		3:
			precio=21;
		4:
			precio=10;
		5:
			precio=18;
		De Otro Modo:
			Escribir "Opcion incorrecta, vuelva a intentar";
	Fin Segun
	Escribir "Por favor ingrese el peso de su paquete en gramos, le recordamos que no puede ser mayor a 5000 G";
	leer peso;
	Si peso>0 Y peso<=5000 Entonces
		Escribir "Su pedido fue aceptado, deberá abonar: " precio*peso " Euros";
	SiNo
		Escribir "Su se encuentra fuera los limites de peso admitidos por la compañia, por favor vuelva a intentar";
	Fin Si
	
	
FinAlgoritmo
