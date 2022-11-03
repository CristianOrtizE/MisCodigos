Algoritmo ejercicio11
    Definir num, i, divcero Como Entero;

    Escribir "Ingrese un número entero y determinaré si es primo o no: ";
    Leer num;

    i = 1;
    divcero = 0;
	
    Mientras i <= num Hacer
		
        Si(num % i == 0) Entonces
            divcero = divcero + 1;
        FinSi
		
        i = i + 1;
		
    FinMientras
	
    Si(divcero == 2) Entonces
        Escribir "El número es un primo.";
    SiNo
        Escribir "El número NO es un número primo.";
    FinSi   
	
FinAlgoritmo