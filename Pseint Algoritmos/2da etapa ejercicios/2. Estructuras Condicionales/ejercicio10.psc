Algoritmo ejercicio10
	Definir x1,y1,x2,y2,r1,r2, distancia Como Real;
	Escribir "Ingrese coordenada x primera circunferencia:"; Leer x1;
	Escribir "Ingrese coordenada y primera circunferencia:"; Leer y1;
	Escribir "Ingrese radio primera circunferencia:"; Leer r1;
	Escribir "Ingrese coordenada x segunda circunferencia:"; Leer x2;
	Escribir "Ingrese coordenada y segunda circunferencia:"; Leer y2;
	Escribir "Ingrese radio segunda circunferencia:"; Leer r2;
	
	distancia <- raiz((x2-x1)^2 + (y2-y1)^2);

	Si distancia> (r1 + r2) Entonces
		Escribir "Son Circunferencias exteriores";
	FinSi
	Si distancia = (r1 + r2) Entonces
		Escribir "Son Circunferencias tangentes exteriores";
	FinSi
	Si distancia < (r1 + r2) Y distancia > abs(r1-r2) Entonces
		Escribir "Son Circunferencias secantes";
	FinSi
	Si distancia = abs(r1-r2) Entonces
		Escribir "Son Circunferencias tangentes interiores";
	FinSi
	Si distancia>0 Y distancia< abs(r1-r2) Entonces
		Escribir "Son Circunferencias interiores";
	FinSi
	Si distancia=0 Entonces
		Escribir "Son Circunferencias concétricas";
	FinSi
FinAlgoritmo