Algoritmo ejercicio7
	Definir expo, base como real;	
	Escribir "Ingrese su base y su exponente paa realizar una potencia: ";
	Leer base;
	Leer expo;
	Si expo>0 Entonces
		Escribir 'La potencia es ',base^expo;
	SiNo
		Si expo=0 Entonces
			Escribir 'La potencia es 1';
		SiNo
			Escribir 'La potencia es ',1/(base^abs(expo));
		FinSi
	FinSi
FinAlgoritmo