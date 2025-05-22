package co.edu.uniquindio.poo;

public class Peaje {
    private Vehiculo vehiculo;
    private Conductor conductor;

    public Peaje(Vehiculo vehiculo, Conductor conductor) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    // METODOS


}
