package es.curso.cine;

public class MenorEdadException extends Exception {
 
	public MenorEdadException () {
		super("La persona es menor de edad y no puede entrar al cine");
	}
 	
}
