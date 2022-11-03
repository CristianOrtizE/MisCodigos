Algoritmo ejercicio17
	Definir hh, mm, ss, i, tt, hl, ml, sl Como Real;
	i=0;
	
	Escribir "Ingrese la hora de partida: ";
	Leer hh;
	Escribir "Ingrese los minutos de partida: ";
	Leer mm;
	Escribir "Ingrese los segundos de partida: ";
	Leer ss;
	Escribir "----------------------------------";
	Escribir "Ingrese los segundos que tardará en llegar: ";
	Leer tt;
	
	hl=trunc (tt/3600);
	tt=tt-(hl*3600);
	hl=hh+hl;
	
	ml=trunc (tt/60);
	tt=tt-(ml*60);
	ml=mm+ml;
	
	sl=ss+tt;
	tt=tt-tt;
	
	Si hl >= 24 Entonces
		hl=hl-24;
	Fin Si
	Si ml >= 60 Entonces
		ml=ml-60;
		hl=hl+1;
	Fin Si
	
	Escribir "Llegara a las: ", hl,":",ml,":",sl;
FinAlgoritmo
