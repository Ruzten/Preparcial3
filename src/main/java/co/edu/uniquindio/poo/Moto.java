package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int peajesPagados, Conductor conductor, ArrayList listPeajes, int cilindraje) {
        super(placa, peajesPagados, conductor, listPeajes);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    // METODOS

    @Override
    public int calcularPeaje() {
        int base = 5000;
        if (cilindraje > 200) {
            base += 2000; // recargo por cilindraje alto
        }
        return base;
    }

    @Override
    public String descripcionDetallada() {
        return "Moto\n" +
                "Placa: " + placa + "\n" +
                "Cilindraje: " + cilindraje + " cc";
    }


}
