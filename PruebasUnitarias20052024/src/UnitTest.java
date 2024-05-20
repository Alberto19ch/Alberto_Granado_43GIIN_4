import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;


public class UnitTest {

    static Producto producto1, producto2, producto3;
    static CarroDeLaCompra carro;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass()");
        producto1 = new Producto("Iphone14", 900, "Iphone 15 completamente nuevo");
        producto2 = new Producto("POCO X6", 300, "Nuevo terminal de xiaomi");
        producto3 = new Producto("Galaxy S3", 900, "Telefono espacial");
        carro = new CarroDeLaCompra();
    }

    //Comprobar que puede haber dos precios iguales
    @Test
    public void testPrecio() {
        assertEquals(producto3.getPrecio(), producto1.getPrecio() );
    }

    //no hay dos productos con el mismo nombre
    @Test
    public void testNombre() {
        assertFalse(producto1.getNombre() == producto2.getNombre());
        assertFalse(producto1.getNombre() == producto3.getNombre());
        assertFalse(producto3.getNombre() == producto2.getNombre());
    }

    //Descripcio de un producto
    @Test
    public void testDescripcion() {
        assertEquals("Iphone 15 completamente nuevo", producto1.getDesc() );
    }

    //Cambio de estado en el carrito a vacio.
    @Test
    public void testCarritoVacio() {
        Integer precio0 = 0;
        assertEquals("Estado del carrito = VACIO", CarroDeLaCompra.ESTADO.VACIO, carro.getEstado());

        carro.AñadirProducto(producto1);
        assertEquals("Estado del carrito = LISTO", CarroDeLaCompra.ESTADO.LISTO, carro.getEstado());

        carro.EliminarProducto(producto1);
        assertEquals("Estado del carrito = VACIO", CarroDeLaCompra.ESTADO.VACIO, carro.getEstado());
        assertEquals("Precio del carrito = 0", precio0, carro.getTotal());
    }

    //Comprobar el número de articulos en el carrito.
    @Test
    public void testCarritoNumProdutos() {
        Integer cant0 = 0;
        Integer cant3 = 3;
        Integer precioTotal = 2100;
        assertEquals("Cantidad de arituculos: 0", cant0, carro.getNumProductos());

        carro.AñadirProducto(producto1);
        carro.AñadirProducto(producto2);
        carro.AñadirProducto(producto3);

        assertEquals("Cantidad de arituculos: 3", cant3, carro.getNumProductos());
        assertEquals("Precio total del carrito", precioTotal, carro.getTotal());

        carro.EliminarProducto(producto1);
        carro.EliminarProducto(producto2);
        carro.EliminarProducto(producto3);
        assertEquals("Cantidad de arituculos: 0", cant0, carro.getNumProductos());

    }
}
