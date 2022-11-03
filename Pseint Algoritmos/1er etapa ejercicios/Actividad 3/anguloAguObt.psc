Algoritmo anguloAguObt
	Definir angulo Como Real;
	Escribir "Programa para determinar si un angulo es agudo u obtuso";
	Escribir "Ingresa un angulo: ";
	Leer angulo;
	SI angulo > 0 Entonces
		Si angulo < 90 Entonces
			Escribir "Es un angulo agudo";
		SiNo
			Escribir "Es un angulo obtuso";
		FinSi
	SiNo
		Escribir "Error numero negativo";
	FinSi
FinAlgoritmo