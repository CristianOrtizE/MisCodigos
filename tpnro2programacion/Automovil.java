package tpnro2programacion;

public class Automovil {
    private String matriculaAutomovil;
    private String modeloAutomovil;
    private String colorAutomovil;
    private String marcaAutomovil;
    private Garaje garajeAsignado;

    // Constructor
    public Automovil(String matriculaAutomovil, String modeloAutomovil, String colorAutomovil, String marcaAutomovil, Garaje garajeAsignado) {
        this.matriculaAutomovil = matriculaAutomovil;
        this.modeloAutomovil = modeloAutomovil;
        this.colorAutomovil = colorAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garajeAsignado = garajeAsignado;
    }

    // Getters y Setters
    public String getMatriculaAutomovil() {
        return matriculaAutomovil;
    }

    public void setMatriculaAutomovil(String matriculaAutomovil) {
        this.matriculaAutomovil = matriculaAutomovil;
    }

    public String getModeloAutomovil() {
        return modeloAutomovil;
    }

    public void setModeloAutomovil(String modeloAutomovil) {
        this.modeloAutomovil = modeloAutomovil;
    }

    public String getColorAutomovil() {
        return colorAutomovil;
    }

    public void setColorAutomovil(String colorAutomovil) {
        this.colorAutomovil = colorAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Garaje getGarajeAsignado() {
        return garajeAsignado;
    }

    public void setGarajeAsignado(Garaje garajeAsignado) {
        this.garajeAsignado = garajeAsignado;
    }
}