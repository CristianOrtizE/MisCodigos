package tpnro2programacion;

public class Agencia {
    private String identificadorAgencia;
    private String nombreAgencia;

    // Constructor
    public Agencia(String identificadorAgencia, String nombreAgencia) {
        this.identificadorAgencia = identificadorAgencia;
        this.nombreAgencia = nombreAgencia;
    }

    // Getters y Setters
    public String getIdentificadorAgencia() {
        return identificadorAgencia;
    }

    public void setIdentificadorAgencia(String identificadorAgencia) {
        this.identificadorAgencia = identificadorAgencia;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }
}