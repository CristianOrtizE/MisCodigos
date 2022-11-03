Algoritmo actividad1
	Definir num, peq, gra, med, i, oc, x como real;
	Escribir "Programa que calcula el más grande, el más pequeño y la media de N números";
	i<-0;
	oc<-0;
	Escribir "Cuantos numeros vas a ingresar?";
	Leer num;
	Si num > 0 Entonces
		Repetir
			Escribir "Ingrese un numero: ";
			Leer x;
			Si i = 0 Entonces
				peq<-x;
				gra<-x;
			FinSi
			Si x<peq Entonces
			peq <- x;
			FinSi
			Si x>gra Entonces
			gra<-x;				
		FinSi
		i=i+1;
		oc=oc+x;
		Hasta Que i=num;
		med<-oc/num;
		Escribir "Mayor: ", gra, " menor: ", peq, " media: ", med;
	SiNo
		Escribir "Error";
	FinSi
	
FinAlgoritmo
