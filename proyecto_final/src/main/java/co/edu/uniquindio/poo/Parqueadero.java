package co.edu.uniquindio.poo;

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
    private final Collection<Puesto> listaPuestos;
    private final Collection<Registro> listaRegistros;
    
    /*
     * Método constructor de la clase Parqueadero
     */
    public Parqueadero (String nombre, Tarifa tarifa){
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.listaPuestos = new LinkedList<>();
        this.listaRegistros = new LinkedList<>();
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
     * Método para obtener la lista de puestos
     */
    public Collection<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    /*
     * Método para obtener la lista de registros
     */
    public Collection<Registro> getListaRegistros() {
        return listaRegistros;
    }
    
    
}
