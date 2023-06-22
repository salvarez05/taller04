package modelo;

import java.util.ArrayList;
import modelo.Accesorios;

public class Tablet extends DispositivoElectronico {
	private String resolucionPantalla;
	private ArrayList<Accesorios> accesorios = new ArrayList<Accesorios>();

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public Tablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}