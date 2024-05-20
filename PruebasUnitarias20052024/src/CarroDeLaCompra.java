import java.util.ArrayList;
import java.util.List;

public class CarroDeLaCompra {
    public enum ESTADO{
        VACIO,
        LISTO,
        COMPRADO
    }
    private List<Producto> listaProductos = new ArrayList<Producto>();

    private Integer total = 0;

    private ESTADO estado = ESTADO.VACIO;

    public CarroDeLaCompra() {
    }

    public CarroDeLaCompra(List<Producto> listaProductos, Integer total, CarroDeLaCompra.ESTADO estado) {
        this.listaProductos = listaProductos;
        this.total = total;
        this.estado = estado;
    }
    
    public void AñadirProducto(Producto producto){
        listaProductos.add(producto);
        total = total + producto.getPrecio();
        estado = ESTADO.LISTO;
    }
    public void EliminarProducto(Producto producto){
        listaProductos.remove(listaProductos.indexOf(producto));
        total = total - producto.getPrecio();
        if (listaProductos.isEmpty()){
            estado = ESTADO.VACIO;
        }
    }

    public Integer getNumProductos(){
        return listaProductos.size();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos1) {
        listaProductos = listaProductos1;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total1) {
        total = total1;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }
    
}
