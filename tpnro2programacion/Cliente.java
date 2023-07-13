package tpnro2programacion;

public class Cliente {
    private int codUniCliente;
    private int DNI_cliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String calleCliente;
    private int numeroCliente;
    private String provinciaCliente;
    private String localidadCliente;
    private String codigoAreaCliente;
    private String telefonoCliente;
  
    // Constructor
    public Cliente(int codUniCliente, int DNI_cliente, String nombreCliente, String apellidoCliente, String calleCliente, int numeroCliente, String provinciaCliente, String localidadCliente, String codigoAreaCliente, String telefonoCliente) {
        this.codUniCliente = codUniCliente;
        this.DNI_cliente = DNI_cliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.calleCliente = calleCliente;
        this.numeroCliente = numeroCliente;
        this.provinciaCliente = provinciaCliente;
        this.localidadCliente = localidadCliente;
        this.codigoAreaCliente = codigoAreaCliente;
        this.telefonoCliente = telefonoCliente;
    }
  
// Getters y setters
    public int getCodUniCliente() {
        return codUniCliente;
    }

    public void setCodUniCliente(int codUniCliente) {
        this.codUniCliente = codUniCliente;
    }

    public int getDNI_cliente() {
        return DNI_cliente;
    }

    public void setDNI_cliente(int DNI_cliente) {
        this.DNI_cliente = DNI_cliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCalleCliente() {
        return calleCliente;
    }

    public void setCalleCliente(String calleCliente) {
        this.calleCliente = calleCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getProvinciaCliente() {
        return provinciaCliente;
    }

    public void setProvinciaCliente(String provinciaCliente) {
        this.provinciaCliente = provinciaCliente;
    }

    public String getLocalidadCliente() {
        return localidadCliente;
    }

    public void setLocalidadCliente(String localidadCliente) {
        this.localidadCliente = localidadCliente;
    }

    public String getCodigoAreaCliente() {
        return codigoAreaCliente;
    }

    public void setCodigoAreaCliente(String codigoAreaCliente) {
        this.codigoAreaCliente = codigoAreaCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
  
// Método para imprimir los datos del cliente
    private void imprimirDatosCliente() {
        System.out.println("CodUniCliente: " + codUniCliente);
        System.out.println("DNI: " + DNI_cliente);
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Apellido: " + apellidoCliente);
        System.out.println("Dirección: " + calleCliente + " " + numeroCliente + ", " + localidadCliente + ", " + provinciaCliente);
        System.out.println("Teléfono: " + codigoAreaCliente + "-" + telefonoCliente);
    }
}