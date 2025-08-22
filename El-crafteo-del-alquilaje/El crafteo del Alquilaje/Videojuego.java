public class Videojuego extends Producto {

	// Attributes
	private String tematica;
	private String consola;

	// Constructors
	public Videojuego() {
	}

	public Videojuego(String nombre, int precioUnit, int cantStock,
			boolean disponible, String tematica, String consola) {
		super(nombre, precioUnit, cantStock, disponible);
		this.tematica = tematica;
		this.consola = consola;
	}

	// Methods
	@Override
	public String toString() {
		return "Videojuego\n" + super.toString() + "Tematica: "
				+ this.tematica + "\n" + "Consola: " + this.consola;
	}

	// Gets and Sets
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getConsola(){
		return consola;
	}

	public void setConsola(String consola){
		this.consola = consola;
	}
}
