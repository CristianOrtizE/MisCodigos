Algoritmo ejercicio16
	Definir dia, llam, precio, total como real;
	Definir turno como logico;
	
	Escribir "Ingrese la longitud en minutos de su llamada: ";
	Leer llam;
	Escribir "Ingrese 1 si la realizo un dia domingo o presione 2 si fue otro dia";
	Leer dia;
	Si dia==2 Entonces
		Escribir "Por favor ingrese 0 si fue turno mañana, o ingrese 1 si fue turno tarde:" ;
		Leer turno;
	Fin Si
	
	Si llam <= 5 Entonces
		precio = 1;
	Fin Si
	Si llam <= 8 Entonces
		precio = 1.8;
	Fin Si
	Si llam <= 10 Entonces
		precio = 2.5;
	Fin Si
	Si llam >= 11 Entonces
		precio = 2.5;
		llam=llam-10;
		precio=precio+(llam*0.50);
	Fin Si
	Si dia==1 Entonces
		total=precio+(precio*3/100);
	SiNo
		Si dia==2 Entonces
			Si turno==Falso Entonces
				total=precio+(precio*15/100);
			SiNo
				total=precio+(precio*10/100);
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "El monto a pagar por su llamada será: ", total;
FinAlgoritmo
