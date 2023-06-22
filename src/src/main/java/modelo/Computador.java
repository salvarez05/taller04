package modelo;

public class Computador extends DispositivoElectronico {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Computador(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String tarjetaVideo, String fuentePoder, String chasis) {
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.chasis=chasis;
		this.fuentePoder=fuentePoder;
		this.tarjetaVideo=tarjetaVideo;
	}

	public String getTipo() {
		return "Computador";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}