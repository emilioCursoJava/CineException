package es.curso.cine;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;
	
	public static int CONTADOR = 0;
	
	public Persona() {
		super();
		System.out.println("Una persona");
	}
	
	public Persona(int edad) {
       this.edad = edad;
       System.out.println("Crea una persona con edad: "+ edad);
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Una persona de nombre: "+ nombre);
    }

    public Persona(int edad, String nombre) {
       this.edad = edad;
       this.nombre = nombre;
       System.out.println("Una persona con edad: "+ edad + " y nombre: "+ nombre);
    }

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}