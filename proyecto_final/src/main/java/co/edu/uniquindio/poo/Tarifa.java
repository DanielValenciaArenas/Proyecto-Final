package co.edu.uniquindio.poo;

/*
 * Clase que que agrupa la información de la tarifa del parqueadero
 * 
 * @authors: Allison López, Luisa Gómez, Daniel Valencia
 * @since 2024
 * Licencia GNU/GPL v3.0
 */

public class Tarifa {
    private final double usoEnHoras;
    private final int costo;
    private final Vehiculo vehiculo;

    /*
     * Método constructor de la clase Tarifa
     */
    public Tarifa (double usoEnHoras, int costo, Vehiculo vehiculo){
        this.usoEnHoras = usoEnHoras;
        this.costo = costo;
        this.vehiculo = vehiculo;
    }

    /*
     * Método para obtener el uso del parqueadero (en horas)
     */
    public double getUsoEnHoras() {
        return usoEnHoras;
    }

    /*
     * Método para obtener el costo de la tarifa
     */
    public int getCosto() {
        return costo;
    }

    /*
     * Método para obtener el vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    



    
}
