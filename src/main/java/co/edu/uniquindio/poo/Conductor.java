package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Conductor extends Persona {
    private ArrayList<Vehiculo> listVehiculos;
    private ArrayList<Peaje> listPeajes;
    public Conductor(String nombres, String apellidos, String id, String fechaNacimiento, int sueldo, ArrayList<Vehiculo> listVehiculos, ArrayList<Peaje> listPeajes) {
        super(nombres, apellidos, id, fechaNacimiento, sueldo);
        this.listVehiculos = listVehiculos;
        this.listPeajes = listPeajes;
    }

    public ArrayList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public ArrayList<Peaje> getListPeajes() {
        return listPeajes;
    }

    public void setListPeajes(ArrayList<Peaje> listPeajes) {
        this.listPeajes = listPeajes;
    }

    // METODOS

    public void AgregarVehiculo (Vehiculo vehiculo) {
        listVehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> buscarVehiculosPorTipo(String tipo) {
        ArrayList<Vehiculo> resultado = new ArrayList<>();

        for (Vehiculo vehiculo : listVehiculos) {
            if (vehiculo.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }


}
