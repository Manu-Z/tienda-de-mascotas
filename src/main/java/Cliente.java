public class Cliente {

    private String nombre; 
    private String direccion; 
    private String numeroContacto; 
    private String identificacion; 



    public Cliente(String nombre, String direccion, String numeroContacto, String identificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.identificacion = identificacion; 
    }


    public String getNombre(){
        return nombre; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getDireccion(){
        return direccion; 

    }

    public void setDireccion(String direccion){
        this.direccion = direccion; 
    }

    public String getNumeroContacto(){
        return numeroContacto; 
    }
    public void setNumeroContacto(String numeroContacto){
        this.numeroContacto = numeroContacto; 
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

   



    
}
