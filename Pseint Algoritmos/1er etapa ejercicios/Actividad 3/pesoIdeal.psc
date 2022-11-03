Algoritmo pesoIdeal
	Definir estatura, peso, pesoid como entero;
	Escribir "Programa que indica el peso ideal de una persona";
	Escribir "Ingrese su estatura en cm";
	leer estatura;
	Escribir "Ingrese su peso en kg";
	leer peso;
	pesoid<-estatura-100;
	Si pesoid>0 y peso>0 y estatura>0 Entonces
		Si peso>pesoid entonces 
			Escribir "Sobrepeso";
		FinSi
		Si peso==pesoid Entonces
			Escribir "Peso ideal";
		FinSi
		Si peso<pesoid Entonces
			Escribir "Peso bajo";
		FinSi
	SiNo
		Escribir "error";
	FinSi
FinAlgoritmo
