
package redesway;


public class servicioDAO {
    private String  codigo;
    private String nomServicio;
    private int cantidad;
    private int precio;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int total) {
        this.precio = total;
    }
    
 

    

    public String getCodigo() {
        return codigo;
    }

    public String getNomServicio() {
        return nomServicio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public int getPrecio(){
        return precio;
    }
    
}
