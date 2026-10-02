package ar.edu.unq.poo2.tp6;
import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Solicitud> solicitudes;

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
        evaluarSolicitud(solicitud);
    }

    private void evaluarSolicitud(Solicitud solicitud) {
        if (solicitud.esAceptable()) {
            desembolsar(solicitud.Cliente(), solicitud.MontoSolicitado());
        }
    }

    private void desembolsar(Cliente cliente, double montoSolicitado) {
        cliente.pagar(montoSolicitado);
    }
}
