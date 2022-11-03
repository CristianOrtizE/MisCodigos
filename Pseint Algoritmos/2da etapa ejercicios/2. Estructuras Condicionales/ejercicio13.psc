Algoritmo ejercicio13
	Definir day, month, year, bis, lday como entero;
	Escribir "Ingrese un dia";
	leer day;
	Escribir "Ingrese un mes";
	Leer month;
	Escribir "Ingrese un año";
	Leer year;
	bis=0;
	
	Si year > 0 Y year < 9999 Entonces
		Si year MOD 4 == 0 Y year MOD 100 <> 0 O year MOD 400 == 0 Entonces
			bis=1;
		Fin si
		Si month > 0 Y month < 13 Entonces
			Si month == 1 O month == 3 O month == 5 O month == 7 O month == 8 O month == 10 O month == 12 Entonces
				lday=32;
			SiNo
				lday=31;
			Fin Si
			Si day > 0 Y day < lday Entonces
				Si month=2 Y bis<>1 Y day>28 Entonces
					Escribir "Error en la fecha, es año bisiesto";
				SiNo
					Escribir "Genial, es correcta la fecha";
				Fin Si
			SiNo
				Escribir "Error en el dia, vuelva a probar";
			Fin Si
		SiNo
			Escribir "Error en el mes, vuelva a probar otro";
		Fin Si
	SiNo
		Escribir "Error en el año, vuelva a probar otro";
	Fin Si



FinAlgoritmo
