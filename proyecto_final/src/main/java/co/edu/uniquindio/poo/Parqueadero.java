package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Clase principal que agrupa la info del parqueadero
 * 
 * @authors: Allison López, Luisa Gómez, Daniel Valencia
 * @since 2024
 * Licencia GNU/GPL v3.0
 */

 public class Parqueadero {
    private final String nombre;
    private final Tarifa tarifa;
    private final Puesto[][] puestosMatriz;
    private final Collection<Registro> listaRegistros;

    /*
     * Método constructor de la clase Parqueadero
     */
    public Parqueadero(String nombre, Tarifa tarifa, int numeroPuestos) {
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.puestosMatriz = new Puesto[numeroPuestos][numeroPuestos];
        this.listaRegistros = new LinkedList<>();
        crearPuestos(numeroPuestos);
    }

    /*
     * Método para obtener el nombre del parqueadero
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener la tarifa del parqueadero
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /*
     * Método para obtener la lista de registros
     */
    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
    }

    /*
     * Método para crear los puestos del parqueadero
     */
    public void crearPuestos(int numeroPuestos) {
        for (int i = 0; i < numeroPuestos; i++) {
            for (int j = 0; j < numeroPuestos; j++) {
                puestosMatriz[i][j] = new Puesto(i, j, EstadoPuesto.VACIO, null);
            }
        }
    }

    /*
     * Método para verificar si un puesto está o no disponible
     */
    public boolean verificarPuestoDisponible(int posicionI, int posicionJ) {
        return puestosMatriz[posicionI][posicionJ].getEstadoPuesto() == EstadoPuesto.VACIO;
    }


    /*
     * Método para registrar el ingreso de un vehículo al parqueadero
     */
    public void registrarIngreso(LocalDateTime momentoEntrada, Puesto puesto, Vehiculo vehiculo) {
        if (puesto.getEstadoPuesto() == EstadoPuesto.VACIO) {
            Registro registro = new Registro(momentoEntrada, null, puesto, vehiculo, tarifa);
            listaRegistros.add(registro);
            puesto.setEstadoPuesto(EstadoPuesto.OCUPADO);
            puesto.setVehiculo(vehiculo);
        } else {
            throw new IllegalStateException("El puesto no está disponible.");
        }
    }
    /*
     * Método para registrar la salida de un vehículo al parqueadero
     */

    public void registrarSalida(LocalDateTime momentoSalida, Puesto puesto) {
        for (Registro registro : listaRegistros) {
            if (registro.getPuesto().equals(puesto) && registro.getMomentoSalida() == null) {
                registro.setMomentoSalida(momentoSalida);
                puesto.setEstadoPuesto(EstadoPuesto.VACIO);
                puesto.setVehiculo(null);
                return;
            }
        }
        throw new IllegalStateException("No se encontró un registro de entrada para el puesto especificado.");
    }
    
    
    

    
}
