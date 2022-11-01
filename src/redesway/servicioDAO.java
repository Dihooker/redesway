
package redesway;


public class servicioDAO {
    private int  codigo;
    private String nomServicio;
    private int cantidad;
    private int total;
    
   public  servicioDAO(int codigo, String nomServicio,int cantidad, int total){
        this.cantidad=cantidad;
        this.codigo=codigo;
        this.nomServicio=nomServicio;
        this.total=total;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomServicio() {
        return nomServicio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public int getTotal(){
        return total;
    }
    
}
