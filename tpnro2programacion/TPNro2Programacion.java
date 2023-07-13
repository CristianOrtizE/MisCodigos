package tpnro2programacion;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TPNro2Programacion {

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de reservas. A continuación, le solicitaremos algunos datos para gestionar la reserva.");
        Scanner scanner = new Scanner(System.in);

// Solicitar los datos para crear un objeto Cliente
        System.out.print("Ingrese el código único del cliente: ");
        int codUniCliente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el DNI del cliente: ");
        int DNI_cliente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        String apellidoCliente = scanner.nextLine();

        System.out.print("Ingrese la calle del cliente: ");
        String calleCliente = scanner.nextLine();

        System.out.print("Ingrese el número de la calle del cliente: ");
        int numeroCliente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la provincia del cliente: ");
        String provinciaCliente = scanner.nextLine();

        System.out.print("Ingrese la localidad del cliente: ");
        String localidadCliente = scanner.nextLine();

        System.out.print("Ingrese el código de área del cliente: ");
        String codigoAreaCliente = scanner.nextLine();

        System.out.print("Ingrese el teléfono del cliente: ");
        String telefonoCliente = scanner.nextLine();

// Crear un objeto Cliente con los datos ingresados
        Cliente cliente1 = new Cliente(codUniCliente, DNI_cliente, nombreCliente, apellidoCliente, calleCliente, numeroCliente, provinciaCliente, localidadCliente, codigoAreaCliente, telefonoCliente);

        System.out.println("Cliente cargado correctamente");

// Solicitar los datos para crear un objeto Agencia
        System.out.print("Ingrese el identificador de la agencia: ");
        String identificadorAgencia = scanner.nextLine();

        System.out.print("Ingrese el nombre de la agencia: ");
        String nombreAgencia = scanner.nextLine();

// Crear un objeto Agencia con los datos ingresados
        Agencia agencia = new Agencia(identificadorAgencia, nombreAgencia);

// Solicitar los datos para crear una reserva
        System.out.print("Ingrese la fecha de inicio de la reserva (dd/mm/aaaa): ");
        String fechaInicioStr = scanner.nextLine();

        System.out.print("Ingrese la fecha de fin de la reserva (dd/mm/aaaa): ");
        String fechaFinStr = scanner.nextLine();

        System.out.print("Ingrese el precio de alquiler por día: ");
        double precioDeAlquiler = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad de vehículos a alquilar: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine();

// Crear un ArrayList para almacenar los autos de la reserva
        ArrayList<Automovil> autos = new ArrayList<>();

// Solicitar los datos para cada vehículo a alquilar
        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.println("\nIngrese los datos para el vehículo " + i + ":");

            System.out.print("Ingrese la matrícula del vehículo: ");
            String matriculaAutomovil = scanner.nextLine();

            System.out.print("Ingrese el modelo del vehículo: ");
            String modeloAutomovil = scanner.nextLine();

            System.out.print("Ingrese el color del vehículo: ");
            String colorAutomovil = scanner.nextLine();

            System.out.print("Ingrese la marca del vehículo: ");
            String marcaAutomovil = scanner.nextLine();

// Solicitar los datos para el garaje asignado

    System.out.print("Ingrese el identificador del garaje asignado: ");
    String identificadorGaraje = scanner.nextLine();

    System.out.print("Ingrese la calle del garaje asignado: ");
    String calleGaraje = scanner.nextLine();

    System.out.print("Ingrese el número de la calle del garaje asignado: ");
    int numeroCalle = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Ingrese la localidad del garaje asignado: ");
    String localidadGaraje = scanner.nextLine();

// Crear un objeto Garaje con los datos ingresados
    Garaje garajeAsignado = new Garaje(identificadorGaraje, calleGaraje, numeroCalle, localidadGaraje);

// Crear un objeto Automovil con los datos ingresados
            Automovil automovil = new Automovil(matriculaAutomovil, modeloAutomovil, colorAutomovil, marcaAutomovil, garajeAsignado);

// Agregar el automóvil al ArrayList de autos
            autos.add(automovil);
        }

// Crear objetos Date a partir de las cadenas de fecha ingresadas
        Date fechaDeInicio = parsearFecha(fechaInicioStr);
        Date fechaDeFin = parsearFecha(fechaFinStr);

// Crear un objeto Reserva con los datos ingresados
        Reserva reserva = new Reserva(cliente1, autos, fechaDeInicio, fechaDeFin, precioDeAlquiler, 0.0, false);

        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioFormateada = formatoFecha.format(reserva.getFechaDeInicio());
        String fechaFinFormateada = formatoFecha.format(reserva.getFechaDeFin());
        
// Imprimir los datos de la reserva
        System.out.println("\nDatos de la reserva:");
        System.out.println("Cliente: " + reserva.getClienteReserva().getNombreCliente() + " " + reserva.getClienteReserva().getApellidoCliente());
        System.out.println("Fecha de inicio: " + fechaInicioFormateada);
        System.out.println("Fecha de fin: " + fechaFinFormateada);
        System.out.println("Precio de alquiler por auto: " + reserva.getPrecioDeAlquiler());
        reserva.calcularPrecioTotal();
        System.out.println("Precio total de la reserva: " + reserva.getPrecioTotalReserva());
        System.out.println("Reserva entregada: " + reserva.isReservaEntregada());
        
        System.out.println("\nVehículos alquilados:");
for (Automovil automovil : reserva.getAutos()) {
    System.out.println("Matrícula: " + automovil.getMatriculaAutomovil() + ", Modelo: " + automovil.getModeloAutomovil() + ", Marca: " + automovil.getMarcaAutomovil() + ", Color: " + automovil.getColorAutomovil());
}
    }

private static Date parsearFecha(String fechaStr) {
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    try {
        return formatoFecha.parse(fechaStr);
    } catch (ParseException e) {
        e.printStackTrace();
        return null;
    }
}
}