Algoritmo ejercicio14
	Definir num1, resi, in como real;
    in <- 0;
    Escribir Sin Saltar "Ingrese un número:";
    Leer num1;
    resi <- num1;
    Mientras resi > 0 Hacer
        in <- in * 10 + resi mod 10;
        resi <- (resi - resi mod 10) / 10;
    FinMientras
    Escribir "Valor del número inverso: ", in;
FinAlgoritmo