Algoritmo ejercicio7
	Definir minu, hora, segu Como Real;
	Escribir "Ingrese una cantidad de minutos y le diremos a cuantas horas y minutos equivalen: ";
	Leer minu;
    hora = TRUNC(minu/60);
    minu = TRUNC((minu - (hora*60))/1);
    
	Escribir "Equivale a horas: ", hora, " minutos: ", minu;
FinAlgoritmo