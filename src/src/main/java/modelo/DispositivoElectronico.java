package modelo;

public abstract class DispositivoElectronico {
	private String marca;
	private int memoriaRAM;
	private int almacenamiento;
	private String procesador;
	private String modelo;
	private int añoFabricacion;
	private int precio;
	private int stock;
	private String tipo;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public DispositivoElectronico(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock) {
		this.marca=marca;
		this.memoriaRAM=memoriaRAM;
		this.modelo=modelo;
		this.almacenamiento=almacenamiento;
		this.añoFabricacion=añoFabricacion;
		this.procesador=procesador;
		this.precio=precio;
	}

	public abstract String getTipo();

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return getTipo()+" marca: "+getMarca()+"" +
				" modelo: "+modelo+"" +
				" memeria RAM: "+getMemoriaRAM()+"GB " +
				"almacenamiento:"+getAlmacenamiento()+" " +
				"año fabricacion: "+getAñoFabricacion()+" " +
				"procesador: "+getProcesador()+" " +
				"precio: $"+getPrecio();
	}
}