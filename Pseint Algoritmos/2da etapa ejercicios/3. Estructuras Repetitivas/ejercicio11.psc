Algoritmo ejercicio11
    Definir num, i, divcero Como Entero;

    Escribir "Ingrese un n�mero entero y determinar� si es primo o no: ";
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
        Escribir "El n�mero es un primo.";
    SiNo
        Escribir "El n�mero NO es un n�mero primo.";
    FinSi   
	
FinAlgoritmo