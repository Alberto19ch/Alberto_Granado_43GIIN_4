
public class Producto {
    private String nombre;
    private Integer precio;
    private String desc;
    private Integer stock;




    
    public Producto(String nombre, Integer precio, String desc, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
        this.stock = stock;
    }

    public Producto(String nombre, Integer precio, String desc) {
        this.nombre = nombre;
        this.precio = precio;
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }



    
}


