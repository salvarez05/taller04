package modelo;

import java.util.ArrayList;
import modelo.DispositivoElectronico;
import modelo.Cliente;

public class Tienda {
	private String direccion;
	private String nombre;
	private ArrayList<DispositivoElectronico> productos = new ArrayList<DispositivoElectronico>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

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
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<DispositivoElectronico> getProductos() {
		return productos;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setProductos(ArrayList<DispositivoElectronico> productos) {
		this.productos = productos;
	}

	public void buscarMarca(String nombreMarca) {

		throw new UnsupportedOperationException();
	}

	public void buscarModelo(String nombreModelo) {
		throw new UnsupportedOperationException();
	}

	public void buscarTipo(String tipo) {
		throw new UnsupportedOperationException();
	}



	public Tienda(String direccion, String nombre) {
		this.direccion=direccion;
		this.nombre=nombre;
	}

	public void agregarCliente(String nombre, String apellido, String correo, int numeroContacto, Cliente.EstadoCivil estadoCivil, String ciudad) {
		if (correoAsociado(correo)==false){
			Cliente cliente= new Cliente(nombre, apellido, correo, numeroContacto, estadoCivil, ciudad);
			clientes.add(cliente);
		}else{
			System.out.println("El correo ya esta asociado a otra cuenta");
		}
	}
	public boolean correoAsociado(String correo){
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCorreo()==correo){
				return true;
			}
		}return false;
	}

	public void agregarDispositivo() {
		System.out.println("");
	}
}