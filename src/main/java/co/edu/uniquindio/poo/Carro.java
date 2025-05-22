package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Carro extends Vehiculo{
    private boolean electrico;
    private boolean servPublico;

    public Carro(String placa, int peajesPagados, Conductor conductor, ArrayList listPeajes, boolean electrico, boolean servPublico) {
        super(placa, peajesPagados, conductor, listPeajes);
        this.electrico = electrico;
        this.servPublico = servPublico;
    }

    public boolean Electrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean ServPublico() {
        return servPublico;
    }

    public void setServPublico(boolean servPublico) {
        this.servPublico = servPublico;
    }

    // METODOS

    @Override
    public int calcularPeaje() {
        double base = 10000;
        if (electrico) {
            base *= 0.8; // 20% de descuento
        }
        if (servPublico) {
            base *= 1.15; // 15% de recargo
        }
        return (int) base;
    }

    @Override
    public String descripcionDetallada() {
        return "Carro\n" +
                "Placa: " + placa + "\n" +
                "Eléctrico: " + electrico + "\n" +
                "Servicio público: " + servPublico;
    }


}
