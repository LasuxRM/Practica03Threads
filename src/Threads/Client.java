package Threads;

public class Client {
	
	private String	nombre;
	private int		edad;
	private int 	tiempo;
	
	public Client(String nombre, int edad,int tiempo) {
		super();
		this.nombre	= nombre;
		this.edad	= edad;
		this.tiempo	= tiempo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
	public void PrintData() {
		System.out.println("Nombre: "	+nombre);
		System.out.println("Edad: "		+edad);
	}

}
