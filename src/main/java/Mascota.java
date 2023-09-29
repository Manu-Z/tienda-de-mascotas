public class Mascota {     

    ///Atributos
    private String nombre; 
    private int edad;
    private String tipo; 
    private String raza; 
    private String codigo; 
    private String interaccion; 

    //Constructor
    public Mascota(String nombre, int edad, String tipo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
        
    }

    /// get: obtener set: modificar 
    public String getNombre(){
        return nombre; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public int getEdad(){
        return edad; 
    }

    public void setEdad(int edad){
        this.edad = edad; 
    }

    public String getTipo(){
        return tipo; 
    }

    public void setTipo(String tipo){
        this.tipo = tipo; 
    }
    public String getRaza(){
        return raza; 
    }

    public void setRaza(String raza){
        this.raza = raza; 
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInteraccion() {
        return interaccion;
    }
    public void setInteraccion(String interaccion) {
        this.interaccion = interaccion;
    }
    
    
   

    
    

    
}
