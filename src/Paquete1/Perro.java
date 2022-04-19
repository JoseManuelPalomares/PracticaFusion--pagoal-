package Paquete1;

public class Perro extends Mascota{

	private String raza;
	
	
	
	
	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}




	public String getRaza() {
		return raza;
	}




	public void setRaza(String raza) {
		this.raza = raza;
	}




	public void MandarMensaje() {
		System.out.println("Soy " + getNombre() + " y soy un " + this.raza);
	}
	
	
}
