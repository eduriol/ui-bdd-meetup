#language: es
Característica: Buscar en la web de DC Comics
Para encontrar historias sobre superhéroes
Como usuario de la web
Quiero poder realizar búsquedas

	Escenario: Buscar páginas sobre Batman
		Dado que estoy en la web de DC Comics
		Cuando busco la palabra "batman"
		Entonces se muestra un listado de resultados
		
	Escenario: Búsqueda sin resultados
		Dado que estoy en la web de DC Comics
		Cuando busco la palabra "palabrainventada"
		Entonces no se muestran resultados