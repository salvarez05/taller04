package modelo;

import java.util.ArrayList;

public class Tablet extends DispositivoElectronico {
	private String resolucionPantalla;
	private ArrayList<Accesorio> accesorios = new ArrayList<Accesorio>();

	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(ArrayList<Accesorio> accesorios) {
		this.accesorios = accesorios;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public Tablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla) {
		super(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock);
		this.resolucionPantalla=resolucionPantalla;
	}

	public String getTipo() {
		return "Tablet";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}