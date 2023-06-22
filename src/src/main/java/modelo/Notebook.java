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
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla=resolucionPantalla;
		this.bateria=bateria;
		this.tipoTeclado=tipoTeclado;

	}

	public String getTipo() {
		return "Notebook";
	}

	@Override
	public String toString() {
		return super.toString()+" resolucion de pantalla: "+getResolucionPantalla()+" bateria: "+getBateria()+"mAh teclado de tipo: "+getTipoTeclado();
	}
}