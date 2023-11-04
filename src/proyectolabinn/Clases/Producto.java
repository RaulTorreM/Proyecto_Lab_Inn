package proyectolabinn.Clases;

public class Producto {

    private int productoID;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;
    private Categoria categoria;
    private Proveedor proveedor;
    private Talla talla;
    

    
    // Constructores, getters y setters
    
    //Métodos
    public void agregarStock(int cantidad) {
        // Incrementar la cantidad en stock del producto
    }
    
    public void vender(int cantidad) {
        // Registrar una venta y reducir la cantidad en stock
    }

    public void actualizarInformacion(String nuevoNombre, double nuevoPrecio) {
        // Actualizar el nombre y precio del producto
    }
}
