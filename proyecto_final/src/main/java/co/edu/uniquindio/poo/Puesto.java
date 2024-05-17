package co.edu.uniquindio.poo;

/*
 * Clase que agrupa la información de un puesto del parqueadero
 * 
 * @authors: Allison López, Luisa Gómez, Daniel Valencia
 * @since 2024
 * Licencia GNU/GPL v3.0
 */

public class Puesto {

    private  EstadoPuesto estadoPuesto;
    private  Vehiculo vehiculo;

    /*
     * Método constructor de la clase Puesto
     */
    public Puesto(int posicionI, int posicionJ, EstadoPuesto estadoPuesto, Vehiculo vehiculo) {

        this.estadoPuesto = estadoPuesto;
        this.vehiculo = vehiculo;
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

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void setEstadoPuesto(EstadoPuesto estadoPuesto) {
        this.estadoPuesto = estadoPuesto;
    }

       /*
     * Método para verificar si el puesto está ocupado
     */
    
     public boolean estaOcupado(){
        return estadoPuesto == EstadoPuesto.OCUPADO;
     }



    

}
