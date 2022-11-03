Algoritmo ejercicio19
	Definir opc Como Entero;
	Escribir "Seleccione una opcion del menú.";
	Escribir "1. La empresa";
	Escribir "2. Nuestros productos:";
	Escribir "3. Noticias";
	Escribir "O presione 0 para salir del programa:";
	Leer opc;
	Si opc<>0 Entonces
	Segun opc Hacer
		1:
			Si opc<>0 Entonces
			Escribir "Seleccione una opcion del menú: La empresa.";
			Escribir "1. Nuestra vision";
			Escribir "2. Nuestra mision:";
			Escribir "3. Nuestros objetivos";
			Escribir "O presione 0 para salir del programa:";
			Leer opc;
			Segun opc Hacer
				1:
					Escribir "Nuestra vision: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
				2:
					Escribir "Nuestra mision: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
				3:
					Escribir "Nuestros objetivos: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
				De otro modo:
			Fin Segun
		FinSi
		
	2:
		Si opc<>0 Entonces
			Escribir "Seleccione una opcion del menú: Nuestros productos.";
			Escribir "1. 2,4 D Etil";
			Escribir "2. Fertilizantes Base";
			Escribir "O presione 0 para salir del programa:";
			Leer opc;
			Segun opc Hacer
				1:
					Escribir "2,4 D Etil: Es un herbicida selectivo de acción sistémica, para aplicaciones post-emergentes, formulado como concentrado emulsionable, especialmente destinado a combatir malezas de hoja ancha en cultivos de cereales, caña de azúcar, campos naturales, y pasturas de gramíneas. Actúa como inhibidor del crecimiento.";
				2:
					Escribir "Seleccione una opcion del menú: Fertilizantes de base.";
					Escribir "1. Fertilizantes nitrogenados";
					Escribir "2. Fertilizantes fosforados";
					Escribir "3. Fertilizantes a base de potasio";
					Escribir "O presione 0 para salir del programa:";
					Leer opc;
					Segun opc Hacer
						1:
							Escribir "Fertilizantes nitrogenados: ";
							Escribir "Los fertilizantes nitrogenados, el grupo más numeroso e importante, requieren varios pasos para su producción. Las materias primas son el nitrógeno del aire y el hidrógeno del gas natural/metano (CH4). Cuando se mezcla a alta temperatura y presión, el producto resultante es el amoníaco (NH3). Este producto intermedio se oxida para producir ácido nítrico (HNO3), que da lugar a los fertilizantes minerales de nitrato de amonio (AN) y, mezclado con CO2, urea. Un tercer tipo de fertilizante nitrogenado es el nitrato amónico de urea (UAN), que se obtiene mezclando AN, urea y agua.";
						2:
							Escribir "Fertilizantes fosforados: ";
							Escribir "Este grupo de fertilizantes procede de la roca fosfórica, un mineral extraído. Cuando el concentrado de fosfato se trata con ácido sulfúrico (H2SO4), se transforma en superfosfato simple (SSP) o ácido fosfórico. Este ácido se mezcla con amoníaco para producir fosfato monoamónico (MAP) o fosfato diamónico (DAP). El fertilizante de superfosfato triple (TSP) puede fabricarse concentrando el ácido fosfórico o concentrando aún más el fosfato.";
						3:
							Escribir "Fertilizantes a base de potasio: ";
							Escribir "Este fertilizante también procede de un mineral extraído: la roca potásica, una amalgama de carbonato de potasio y sales de potasio. El proceso de fabricación de los fertilizantes potásicos comienza con la concentración de la potasa y su tratamiento para obtener una solución de cloruro potásico. Esta solución produce muriato de potasio (MOP), nitrato de potasio (KN) cuando se mezcla con ácido nítrico, y sulfato de potasio (SOP) cuando se mezcla con ácido sulfúrico.";
						De Otro Modo:
							Escribir "Opcion erronea";
					Fin Segun
				De Otro Modo:
					Escribir "Programa concluido";
			Fin Segun
		FinSi
	3:
		Si opc<>0 Entonces
			Escribir "Seleccione una opcion del menú: Noticias.";
			Escribir "1. Precios del cereal";
			Escribir "2. BioNoticias";
			Escribir "O presione 0 para salir del programa:";
			Leer opc;
			Segun opc Hacer
				1:
					Escribir "Precios del cereales de hoy:" ;
					Escribir "Trigo	 Wheat               S/C";
					Escribir "Maíz	Yellow corn	     $ 33.320,00";
					Escribir "Girasol Sunseed           S/C";
					Escribir "Soja	Soybean	         $ 68.300,00";
					Escribir "Sorgo Grain sorghum       S/C";
				2:
					Escribir "BioNoticias: *******En desarrollo*******";
				De Otro Modo:
					Escribir "Programa concluido";
			Fin Segun
		FinSi
	De Otro Modo:
		Escribir "Programa concluido";
	Fin Segun

	SiNo
		Escribir "Programa concluido";
	FinSi
FinAlgoritmo
