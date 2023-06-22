package modelo;

import java.util.ArrayList;

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

	public void buscarPorMarca(String nombreMarca) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getMarca()==nombreMarca){
				System.out.println(getProductos().get(i).toString());
			}
		}
	}

	public void buscarPorModelo(String nombreModelo) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getMarca()==nombreModelo){
				System.out.println(getProductos().get(i).toString());
			}
		}
	}

	public void buscarPorTipo(String tipo) {
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getMarca()==tipo){
				System.out.println(getProductos().get(i).toString());
			}
		}
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

	public void agregarComputador(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String tarjetaVideo, String fuentePoder, String chasis, String marcaPantalla, String modeloPantalla, int añoPantalla) {
		Computador computador=new Computador(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock, tarjetaVideo, fuentePoder, chasis);
		Pantalla pantalla =new Pantalla(marcaPantalla,modeloPantalla,añoPantalla);
		computador.setPantalla(pantalla);
		productos.add(computador);
	}
	public void agregarNotebook(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla, String tipoTeclado, int bateria) {
		Notebook notebook=new Notebook(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock, resolucionPantalla,tipoTeclado,bateria);
		productos.add(notebook);
	}
	public void agregarTablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int stock, String resolucionPantalla){
		Tablet tablet=new Tablet(marca, memoriaRAM, almacenamiento, procesador, modelo, añoFabricacion, precio, stock, resolucionPantalla);
		productos.add(tablet);
	}
}