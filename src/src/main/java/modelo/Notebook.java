package modelo;

public class Notebook extends DispositivoElectronico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private int bateria;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public Notebook(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla, String tipoTeclado, int bateria) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}