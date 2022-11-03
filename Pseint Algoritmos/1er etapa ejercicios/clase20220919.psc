Funcion calcular_area_perimetro(r, perimporreferencia, areaporreferencia)
	Definir area, perim como real;
	area<-PI*r^2;
	perim<-2*PI*r;
FinFuncion

Algoritmo clase20220919
	Definir r, a, p como real;
	p=0;
	a=0;
	Escribir "Ingrese el radio de la circunferencia para calcular el area y perimetro";
	Leer r;
	calcular_area_perimetro(r, p, a);
	Escribir "El area de la circunferencia es: ", a, " y el perimetro es: ",p;
	
FinAlgoritmo
