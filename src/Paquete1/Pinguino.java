package Paquete1;

public class Pinguino extends Mascota {
	
	String noVolador; 
	boolean grazna; 

	
	



	public Pinguino(String nombre, boolean volador,  boolean grazna) {
		super(nombre);
		this.noVolador = noVolador;
		this.grazna = grazna;
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
	

	public boolean isGrazna() {
		return grazna;
	}

	public void setGrazna(boolean grazna) {
		this.grazna = grazna;
	}
	
	public void MandarMensaje() {
		System.out.println("Soy " + getNombre() + " y soy un ave que no vuela, pero si grazna");
	}
	
	

}
