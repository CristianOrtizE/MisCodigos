Algoritmo Aritmeticos
	Definir opcion, suma1, suma2, resuma, resta1, resta2, reresta, multi1, multi2, remulti, divi1, divi2, redivi, pote1, pote2, repote Como Real;
	Escribir "Programa que realiza operaciones aritmeticas";
	Escribir "Elegir operacion:";
	Escribir "1. Suma";
	Escribir "2. Resta";
	Escribir "3. Multiplicacion";
	Escribir "4. Division";
	Escribir "5. Potenciacion";
	Leer opcion;
	
	Segun opcion Hacer
		1:
			Escribir "Elegiste hacer una suma, por favor ingrese los dos numeros a sumar: ";
			Leer suma1;
			Leer suma2;
			resuma<-suma1+suma2;
			Escribir "La suma de: ", suma1, " + ", suma2, " es= ", resuma;
		2:
			Escribir "Elegiste hacer una resta, por favor ingrese los dos numeros a restar: ";
			Leer resta1;
			Leer resta2;
			reresta<-resta1-resta2;
			Escribir "La resta de: ", resta1, " - ", resta2, " es= ", reresta;
		3:
			Escribir "Elegiste hacer una multiplicacion, por favor ingrese los dos numeros a multiplicar: ";
			Leer multi1;
			Leer multi2;
			remulti<-multi1*multi2;
			Escribir "La multiplicacion de: ", multi1, " * ", multi2, " es= ", remulti;
		4:
			Escribir "Elegiste hacer una division, por favor ingrese los dos numeros a dividir: ";
			Leer divi1;
			Leer divi2;
			redivi<-divi1/divi2;
			Escribir "La division de: ", divi1, " / ", divi2, " es= ", redivi;
		5:
			Escribir "Elegiste hacer una potenciacion, por favor ingrese el numero a potenciar seguido de su potencia: ";
			Leer pote1;
			Leer pote2;
			repote<-pote1^pote2;
			Escribir "La potencia de: ", pote1, " elevado a ", pote2, " es= ", repote;
		De Otro Modo:
			Escribir "El numero ingresado no es valido";
	Fin Segun
	
FinAlgoritmo
