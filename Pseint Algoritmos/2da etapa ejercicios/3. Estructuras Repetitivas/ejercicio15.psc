Algoritmo ejercicio15
	Definir monto, acu, i como real;
	i=0;
	Escribir "Ingrese el monto del primer mes y le calcularé cuanto deberá pagar en cada mes (20 cuotas)";
	Leer monto;
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Escribir "El monto a pagar el mes: ", i, " será de: $", monto;
		monto=monto*2;
	Fin Para
	

FinAlgoritmo
