

package proyectolabinn.Clases;
import java.util.Date;

public class Promocion {
    private int promocionID;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String tipoDescuento;
    private double valorDescuento;
    private Sucursal sucursal;

    // Constructores, getters y setters
    
    public boolean estaActiva() {
        // Verificar si la promoción está activa según las fechas
        return false;
    }
    
}
