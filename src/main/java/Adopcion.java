public class Adopcion {
    
    private Mascota mascota;
    private Cliente cliente;
    private String fecha;

    public Adopcion(Mascota mascota, Cliente cliente, String fecha) {
        this.mascota = mascota;
        this.cliente = cliente;
        this.fecha = fecha;
    }
    
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
