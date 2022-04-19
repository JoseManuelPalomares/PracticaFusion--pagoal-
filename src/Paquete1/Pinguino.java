package Paquete1;

public class Pinguino extends Mascota {
	
	String noVolador; 

	
	
	public Pinguino(String nombre, boolean volador) {
		super(nombre);
		this.noVolador = noVolador;
	}

	public Pinguino(String nombre) {
		super(nombre);
		
	}

	public String getNoVolador() {
		return noVolador;
	}

	public void setNoVolador(String noVolador) {
		this.noVolador = noVolador;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + getNombre() + " y soy un ave que no vuela");
	}
	
	

}
