package co.edu.uniquindio.poo;

import java.util.ArrayList;

public abstract class Vehiculo {
    protected String placa;
    protected int peajesPagados;
    protected Conductor conductor;
    protected ArrayList ListPeajes;

    public Vehiculo(String placa, int peajesPagados, Conductor conductor, ArrayList listPeajes) {
        this.placa = placa;
        this.peajesPagados = peajesPagados;
        this.conductor = conductor;
        ListPeajes = listPeajes;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeajesPagados() {
        return peajesPagados;
    }

    public void setPeajesPagados(int peajesPagados) {
        this.peajesPagados = peajesPagados;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public ArrayList getListPeajes() {
        return ListPeajes;
    }

    public void setListPeajes(ArrayList listPeajes) {
        ListPeajes = listPeajes;
    }

    // METODOS


    public abstract int calcularPeaje();

    public abstract String descripcionDetallada();

    public void VincularConductor (Conductor conductor) {
        this.conductor = conductor;
    }

    public String nombreConductor () {
        String nombre = conductor.getNombres() + " " + conductor.getApellidos();
        return nombre;
    }

}
