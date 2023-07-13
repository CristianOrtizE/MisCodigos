package tpnro2programacion;

public class Garaje {
    private String identificadorGaraje;
    private String calleGaraje;
    private int numeroCalle;
    private String localidadGaraje;

    // Constructor
    public Garaje(String identificadorGaraje, String calleGaraje, int numeroCalle, String localidadGaraje) {
        this.identificadorGaraje = identificadorGaraje;
        this.calleGaraje = calleGaraje;
        this.numeroCalle = numeroCalle;
        this.localidadGaraje = localidadGaraje;
    }

    // Getters y Setters
    public String getIdentificadorGaraje() {
        return identificadorGaraje;
    }

    public void setIdentificadorGaraje(String identificadorGaraje) {
        this.identificadorGaraje = identificadorGaraje;
    }

    public String getCalleGaraje() {
        return calleGaraje;
    }

    public void setCalleGaraje(String calleGaraje) {
        this.calleGaraje = calleGaraje;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getLocalidadGaraje() {
        return localidadGaraje;
    }

    public void setLocalidadGaraje(String localidadGaraje) {
        this.localidadGaraje = localidadGaraje;
    }
}