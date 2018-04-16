import java.util.ArrayList;

public class Prestamo {
    private int numPrestamo;
    private int valor;
    private Fecha fechaAutorizacion;
    private Fecha fechaEntrega;
    private ArrayList<Solicitante> datosSolicitante;

    public Prestamo(int numPrestamo, int valor, Fecha fechaAutorizacion, Fecha fechaEntrega, Solicitante solicitante) {
        this.numPrestamo = numPrestamo;
        this.valor = valor;
        this.fechaAutorizacion = fechaAutorizacion;
        this.fechaEntrega = fechaEntrega;
        this.datosSolicitante.add(solicitante);
    }


}
