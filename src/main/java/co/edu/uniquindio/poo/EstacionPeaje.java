package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje implements GestionDinero {
    private String nombre;
    private String departamento;
    private int recaudo;
    private ArrayList<Vehiculo> listRegistroVehiculos;
    private ArrayList<Conductor> listConductores;
    private ArrayList<Recaudador> listRecaudadores;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.recaudo = 0;
        this.listRegistroVehiculos = new ArrayList<>();
        this.listConductores = new ArrayList<>();
        this.listRecaudadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getRecaudo() {
        return recaudo;
    }

    public void setRecaudo(int recaudo) {
        this.recaudo = recaudo;
    }

    public ArrayList<Vehiculo> getListRegistroVehiculos() {
        return listRegistroVehiculos;
    }

    public void setListRegistroVehiculos(ArrayList<Vehiculo> listRegistroVehiculos) {
        this.listRegistroVehiculos = listRegistroVehiculos;
    }

    public ArrayList<Conductor> getListConductores() {
        return listConductores;
    }

    public void setListConductores(ArrayList<Conductor> listConductores) {
        this.listConductores = listConductores;
    }

    public ArrayList<Recaudador> getListRecaudadores() {
        return listRecaudadores;
    }

    public void setListRecaudadores(ArrayList<Recaudador> listRecaudadores) {
        this.listRecaudadores = listRecaudadores;
    }

    // metodos

    public void vincularVehiculoConductor (String idConductor, String placaVehiculo) {
        Vehiculo vehiculoElegido = null;
        Conductor conductorElegido = null;
        for (Vehiculo vehiculo : listRegistroVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placaVehiculo)) {
                vehiculoElegido = vehiculo;
                break;
            }
        }
        for (Conductor conductor : listConductores) {
            if (conductor.getId().equalsIgnoreCase(idConductor)) {
                conductorElegido = conductor;
                break;

            }
        }
        vehiculoElegido.VincularConductor(conductorElegido);
        conductorElegido.AgregarVehiculo(vehiculoElegido);
    }

    public String reporteVehiculos() {
        String reporte = "=== Reporte de vehículos que han pasado por el peaje ===\n\n";
        int total = 0;

        for (Vehiculo vehiculo : listRegistroVehiculos) {

            reporte += vehiculo.descripcionDetallada() + "\n";
            reporte += "Valor del peaje: $" + vehiculo.calcularPeaje() + "\n";
            reporte += "-------------------------------\n";

            total += vehiculo.calcularPeaje();
        }

        reporte += "\nTOTAL ACUMULADO: $" + total + "\n";

        return reporte;
    }

    public ArrayList<Conductor> buscarConductoresMasDiezT() {
        ArrayList<Conductor> conductoresMayoresDiez = new ArrayList<>();
        for (Conductor conductor : listConductores) {
            for (Vehiculo vehiculo : conductor.getListVehiculos()) {
                if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo;
                    if (camion.getCapToneladas() > 10) {
                        conductoresMayoresDiez.add(conductor);
                        break;
                    }
                }
            }
        }
        return conductoresMayoresDiez;
    }

    @Override
    public Recaudador buscarRecaudador(String nombreCompleto) {
        String buscado = nombreCompleto.trim().toLowerCase().replace(" ", "");

        for (Recaudador r : listRecaudadores) {
            String actual = (r.getNombres() + r.getApellidos()).trim().toLowerCase().replace(" ", "");
            if (actual.equals(buscado)) {
                return r;
            }
        }

        return null;
    }

    @Override
    public void registrarTotalRecaudado(int valor) {
        this.recaudo += valor;
}
}
