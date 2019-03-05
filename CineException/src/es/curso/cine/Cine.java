package es.curso.cine;

public class Cine {
	public static void main(String[] args) {
		Persona p = new Persona(16);
		Persona p2 = new Persona(21);
		System.out.println("************************");
		try {
			verPelicula(p);
		} catch (MenorEdadException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Esto se ejecuta siempre 1");
		}
		
		try {
			verPelicula(p2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Esto se ejecuta siempre 2");
		}
		
	}
	
	public static void verPelicula(Persona p) throws MenorEdadException{
		if(p.getEdad() < 18){
			throw new MenorEdadException();
		}
		
		//si se lanzo la excepcion, este bloque no se ejecuta
		System.out.println("Viendo pelicula ...");
	}


}
