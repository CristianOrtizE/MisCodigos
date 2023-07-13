package tpnro2programacion;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private Cliente clienteReserva;
    private ArrayList<Automovil> autos;
    private Date fechaDeInicio;
    private Date fechaDeFin;
    private double precioDeAlquiler;
    private double precioTotalReserva;
    private boolean reservaEntregada;

    // Constructor
    public Reserva(Cliente clienteReserva, ArrayList<Automovil> autos, Date fechaDeInicio, Date fechaDeFin, double precioDeAlquiler, double precioTotalReserva, boolean reservaEntregada) {
        this.clienteReserva = clienteReserva;
        this.autos = autos;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.precioDeAlquiler = precioDeAlquiler;
        this.precioTotalReserva = 0.0;
        this.reservaEntregada = false;
    }

    // Getters y Setters
    public Cliente getClienteReserva() {
        return clienteReserva;
    }

    public void setClienteReserva(Cliente clienteReserva) {
        this.clienteReserva = clienteReserva;
    }

    public ArrayList<Automovil> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Automovil> autos) {
        this.autos = autos;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public double getPrecioDeAlquiler() {
        return precioDeAlquiler;
    }

    public void setPrecioDeAlquiler(double precioDeAlquiler) {
        this.precioDeAlquiler = precioDeAlquiler;
    }

    public double getPrecioTotalReserva() {
        return precioTotalReserva;
    }

    public void setPrecioTotalReserva(double precioTotalReserva) {
        this.precioTotalReserva = precioTotalReserva;
    }

    public boolean isReservaEntregada() {
        return reservaEntregada;
    }

    public void setReservaEntregada(boolean reservaEntregada) {
        this.reservaEntregada = reservaEntregada;
    }

    // Método para calcular el precio total de la reserva
    public void calcularPrecioTotal() {
        int cantidadAutos = autos.size();
        precioTotalReserva = precioDeAlquiler * cantidadAutos;
    }

    // Método para marcar la reserva como entregada
    public void marcarEntregada() {
        reservaEntregada = true;
    }
}