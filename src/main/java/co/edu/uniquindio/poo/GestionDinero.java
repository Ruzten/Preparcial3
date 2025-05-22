package co.edu.uniquindio.poo;

public interface GestionDinero {
    Recaudador buscarRecaudador(String nombreCompleto);
    void registrarTotalRecaudado(int monto);
}
