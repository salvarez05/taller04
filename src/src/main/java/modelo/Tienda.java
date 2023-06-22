package modelo;

import java.util.ArrayList;
import modelo.DispositivoElectronico;
import modelo.Cliente;

public class Tienda {
	private String direccion;
	private String nombre;
	private ArrayList<DispositivoElectronico> productos = new ArrayList<DispositivoElectronico>();
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void buscarMarca(String nombreMarca) {
		throw new UnsupportedOperationException();
	}

	public void buscarModelo(Sttring nombreModelo) {
		throw new UnsupportedOperationException();
	}

	public void buscarTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public Tienda(String direccion, String nombre) {
		throw new UnsupportedOperationException();
	}

	public void agregarCliente() {
		throw new UnsupportedOperationException();
	}

	public void agregarDispositivo() {
		throw new UnsupportedOperationException();
	}
}