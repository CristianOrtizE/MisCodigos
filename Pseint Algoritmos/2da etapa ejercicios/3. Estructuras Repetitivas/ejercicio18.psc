Algoritmo ejercicio18
	Definir hor, min, sec como entero;
	hor=0;
	min=0;
	sec=0;
	Mientras hor<=23 Hacer
		Mientras min<=59 Hacer
			Mientras sec<=59 Hacer
				Limpiar Pantalla;
				si hor >9 Entonces
					Escribir ":",hor Sin Saltar;
				SiNo
					escribir "0", hor Sin Saltar;
				FinSi
				si min >9 Entonces
					Escribir ":",min Sin Saltar;
				SiNo
					escribir ":0", min Sin Saltar;
				FinSi
				si sec >9 Entonces
					Escribir ":",sec Sin Saltar;
				SiNo
					escribir ":0", sec Sin Saltar;
				FinSi
				sec=sec+1;
				Esperar 1 segundo;
				
			FinMientras
			sec = 0;
			min = min +1;
		FinMientras
		min=0;
		hor=hor+1;
	FinMientras
	
FinAlgoritmo
