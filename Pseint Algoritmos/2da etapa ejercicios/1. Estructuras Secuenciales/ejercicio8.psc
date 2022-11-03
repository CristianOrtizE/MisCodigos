Algoritmo ejercicio8
	Definir sue, com, porce, cantiven, i, monven, totven como real;
	Definir nomvent como texto;
	i=1;
	totven=0;
	Escribir "Sistema de liquidacion de sueldos y comisiones:";
	Escribir "Ingrese el nombre de su empleado: ";
	Leer nomvent;
	Escribir "Ingrese el sueldo base de su empleado y el porcentaje de comision:";
	Leer sue;
	Leer porce;
	Escribir "Perfecto! Ahora ingrese la cantidad de ventas hechas en el periodo y luego el monto de cada venta";
	Leer cantiven;
	Para i<-1 Hasta cantiven Con Paso 1 Hacer
		Escribir "Ingrese el monto de su venta nro: ", i;
		Leer monven;
		totven<-totven+monven;
	Fin Para
	com<-totven*porce/100;
	Escribir "------------------------------------------------------------------------: ";
	Escribir "Empleado: ", nomvent;
	Escribir "Su sueldo base será de:", sue;
	Escribir "La cantidad de ventas del periodo fue de: ", cantiven;
	Escribir "Por la que cobrara una comision de: ", com;
	Escribir "El total cobrado es: ", sue + com;
	Escribir "------------------------------------------------------------------------: ";
FinAlgoritmo
