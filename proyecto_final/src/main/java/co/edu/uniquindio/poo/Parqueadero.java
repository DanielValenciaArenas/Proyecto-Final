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

    public String identificarPropietario(int posicionI, int posicionJ) {
        assert (posicionI >= 0 && posicionI < puestosMatriz.length && posicionJ >= 0 && posicionJ < puestosMatriz[0].length) : "Coordenadas del puesto fuera de rango.";
    
        Puesto puesto = puestosMatriz[posicionI][posicionJ];
        Vehiculo vehiculo = puesto.getVehiculo();
    
        if (vehiculo != null) {
            return vehiculo.getPropietario().getNombre();
        } else {
            return "No hay vehículo en el puesto especificado";
        }
    }
    
    
    }


