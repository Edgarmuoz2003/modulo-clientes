package Entidad;

public class Cliente {

    int ID;
    String RazonSocial;
    String TELEFONO;
    String DIRECCION;

    public Cliente() {
    }

    public Cliente(int ID, String RazonSocial, String TELEFONO, String DIRECCION) {
        this.ID = ID;
        this.RazonSocial = RazonSocial;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

}
