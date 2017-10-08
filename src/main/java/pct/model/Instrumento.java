package pct.model;

public enum Instrumento {

	Trompeta,//index 0 --> id 0 en la BD
	Flugel,//index 1 --> id 1 en la BD
	Corno,//index 2 --> idem
	Trombon,//index 3 --> idem 
	Tuba;//index 4 --> idem

	//https://stackoverflow.com/questions/13659217/where-is-the-documentation-for-the-values-method-of-enum
	/*
	Nota aclaratoria:
	En realidad, no mapea por ID sino por indice.
	Hibernate, al tratar de obtener el enum hace algo asi como:
		...
		Instrumento i = Instrumento.values()[valor_de_la_bd];
		integrante.setInstrumento(i)
		...
	Entonces, valor_de_la_bd termina siendo el index del enum, no el id
 	*/
}
