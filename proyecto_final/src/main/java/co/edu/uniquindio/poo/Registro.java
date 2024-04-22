package co.edu.uniquindio.poo;

/*
 * Clase que agrupa la información del registro del parqueadero
 * 
 * @authors: Allison López, Luisa Gómez, Daniel Valencia
 * @since 2024
 * Licencia GNU/GPL v3.0
 */

public class Registro {
    private final String momentoEntrada;
    private final Puesto puesto;
    private final Vehiculo vehiculo;

    /*
     * Método constructor de la clase Registro
     */
    public Registro(String momentoEntrada, Puesto puesto, Vehiculo vehiculo) {
        this.momentoEntrada = momentoEntrada;
        this.puesto = puesto;
        this.vehiculo = vehiculo;
    }

    /*
     * Método para obtener el momento de entrada de un vehiculo
     */
    public String getMomentoEntrada() {
        return momentoEntrada;
    }

    /*
     * Método para obtener el puesto registrado
     */
    public Puesto getPuesto() {
        return puesto;
    }

    /*
     * Método para obtener el vehiculo registrado 
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    
}
