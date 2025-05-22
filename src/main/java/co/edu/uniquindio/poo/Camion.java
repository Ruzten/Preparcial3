package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    private int cantEjes;
    private double capToneladas;

    public Camion(String placa, int peajesPagados, Conductor conductor, ArrayList listPeajes, int cantEjes, double capToneladas) {
        super(placa, peajesPagados, conductor, listPeajes);
        this.cantEjes = cantEjes;
        this.capToneladas = capToneladas;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public double getCapToneladas() {
        return capToneladas;
    }

    public void setCapToneladas(double capToneladas) {
        this.capToneladas = capToneladas;
    }

    // METODOS

    @Override
    public int calcularPeaje() {
        double base = 7000 * cantEjes;
        if (capToneladas > 10) {
            base *= 1.10; // recargo del 10% si supera 10 toneladas
        }
        return (int) base;
    }

    @Override
    public String descripcionDetallada() {
        return "Camión\n" +
                "Placa: " + placa + "\n" +
                "Cantidad de ejes: " + cantEjes + "\n" +
                "Capacidad de carga: " + capToneladas + " toneladas";
    }


}
