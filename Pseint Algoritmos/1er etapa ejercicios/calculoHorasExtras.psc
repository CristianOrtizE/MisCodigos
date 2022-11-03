Algoritmo calculoHorasExtras
	
	//A un trabajador le pagan según sus horas trabajadas y la tarifa está a un valor por hora. 
	//Si la cantidad  de horas trabajadas es mayor a 40 horas, la tarifa por hora  se  incrementa  en  un  
	//50%  para  las  horas   extras. Calcular  el  salario  del trabajador dadas las horas trabajadas y la tarifa
	
	Definir cantidadHoras, precioHora, sueldoConvencional, sueldoExtra, horasExtras, horasSimples Como Real;
	
	Escribir "Ingrese las horas trabajadas del mes: ";
	Leer cantidadHoras;
	
	Escribir "Ingrese el precio por hora del trabajador: ";
	Leer precioHora;
	
	Si cantidadHoras>40 Entonces
		horasExtras<-cantidadHoras-40;
	SiNo
		horasExtras=0;
	Fin Si
	
	Si horasExtras<>0 Entonces
		cantidadHoras<-cantidadHoras-horasExtras;
	SiNo
		
	Fin Si
	
	sueldoConvencional<-cantidadHoras*precioHora;
	
	sueldoExtra<-precioHora*horasExtras*1.5;
	
	Escribir "El trabajador debe cobrar de horas convencionales $",sueldoConvencional, " y debera cobrar de horas extras $", sueldoExtra, " lo que da un total de $", sueldoConvencional+sueldoExtra;
	
FinAlgoritmo
