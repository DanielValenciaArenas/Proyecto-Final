package co.edu.uniquindio.poo;

/*
 * Clase que agrupa la información de un puesto del parqueadero
 * 
 * @authors: Allison López, Luisa Gómez, Daniel Valencia
 * @since 2024
 * Licencia GNU/GPL v3.0
 */

public class Puesto {
    private final int posicionI;
    private final int posicionJ;
    private final EstadoPuesto estadoPuesto;
    private final Vehiculo vehiculo;

    /*
     * Método constructor de la clase Puesto
     */
    public Puesto(int posicionI, int posicionJ, EstadoPuesto estadoPuesto, Vehiculo vehiculo) {
        this.posicionI = posicionI;
        this.posicionJ = posicionJ;
        this.estadoPuesto = estadoPuesto;
        this.vehiculo = vehiculo;
    }

    /*
     * Método para obtener la posición I del puesto
     */
    public int getPosicionI() {
        return posicionI;
    }

    /*
     * Método para obtener la posición J del puesto
     */
    public int getPosicionJ() {
        return posicionJ;
    }

    /*
     * Método para obtener el estado del puesto (vacio / ocupado)
     */
    public EstadoPuesto getEstadoPuesto() {
        return estadoPuesto;
    }

    /*
     * Método para obtener el vehículo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    

    

}
