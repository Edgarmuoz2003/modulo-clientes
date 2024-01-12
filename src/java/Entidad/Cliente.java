package Entidad;

public class Cliente {

    int id;
    String RazonSocial;
    String telefono;
    String direccion;

    public Cliente() {
    }

    public Cliente(int id, String RazonSocial, String telefono, String direccion) {
        this.id = id;
        this.RazonSocial = RazonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

}
