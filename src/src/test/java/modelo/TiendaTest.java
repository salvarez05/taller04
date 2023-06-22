package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void buscarPorMarca() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarComputador("a",3,23,"p","m",2018,400,2,"s","ew","ch","sa","a",2018);
        tiendatest.agregarComputador("s",3,23,"p","m",2018,400,4,"a","ew","ch","sa","a",2018);
        tiendatest.agregarNotebook("d",3,23,"p","m",2018,400,2,"s","mec",500);
        tiendatest.agregarNotebook("a",3,23,"p","m",2018,400,2,"s","mec",500);
        tiendatest.agregarTablet("a",3,23,"p","m",2018,400,2,"s");
        tiendatest.agregarTablet("a",3,23,"p","m",2018,400,2,"s");
        tiendatest.buscarPorMarca("a");
    }

    @Test
    void buscarPorModelo() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarComputador("a",3,23,"p","m",2018,400,2,"s","ew","ch","sa","a",2018);
        tiendatest.agregarComputador("s",3,23,"p","s",2018,400,4,"a","ew","ch","sa","a",2018);
        tiendatest.agregarNotebook("d",3,23,"p","a",2018,400,2,"s","mec",500);
        tiendatest.agregarNotebook("a",3,23,"p","b",2018,400,2,"s","mec",500);
        tiendatest.agregarTablet("a",3,23,"p","e",2018,400,2,"s");
        tiendatest.agregarTablet("a",3,23,"p","h",2018,400,2,"s");
        tiendatest.buscarPorModelo("m");
    }

    @Test
    void buscarPorTipo() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarComputador("a",3,23,"p","m",2018,400,2,"s","ew","ch","sa","a",2018);
        tiendatest.agregarComputador("s",3,23,"p","m",2018,400,4,"a","ew","ch","sa","a",2018);
        tiendatest.agregarNotebook("d",3,23,"p","m",2018,400,2,"s","mec",500);
        tiendatest.agregarNotebook("a",3,23,"p","m",2018,400,2,"s","mec",500);
        tiendatest.agregarTablet("a",3,23,"p","m",2018,400,2,"s");
        tiendatest.agregarTablet("a",3,23,"p","m",2018,400,2,"s");
        tiendatest.buscarPorTipo("Notebook");
        tiendatest.buscarPorTipo("Tablet");
    }

    @Test
    void agregarCliente() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarCliente("s","a","c",3, Cliente.EstadoCivil.soltero,"c");
        tiendatest.agregarCliente("d","r","c",3, Cliente.EstadoCivil.soltero,"c");
        assertEquals(1,tiendatest.getClientes().size());
    }

    @Test
    void agregarComputador() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarComputador("a",3,23,"p","m",2018,400,2,"s","ew","ch","sa","a",2018);
        assertEquals(1,tiendatest.getProductos().size());
    }

    @Test
    void agregarNotebook() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarNotebook("a",3,23,"p","m",2018,400,2,"s","mec",500);
        assertEquals(1,tiendatest.getProductos().size());
    }

    @Test
    void agregarTablet() {
        Tienda tiendatest= new Tienda("a","b");
        tiendatest.agregarTablet("a",3,23,"p","m",2018,400,2,"s");
        assertEquals(1,tiendatest.getProductos().size());
    }
}