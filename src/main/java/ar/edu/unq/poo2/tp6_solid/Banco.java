package ar.edu.unq.poo2.tp6_solid;
import ar.edu.unq.poo2.tp6_solid.solicitudes.Solicitud;

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
            desembolsar(solicitud.Cliente(), solicitud.montoSolicitado());
        }
    }

    private double totalADesembolsar(Cliente cliente, double montoSolicitado) {
        return solicitudes.stream().mapToDouble(Solicitud::montoSolicitado).sum();
    }

    private void desembolsar(Cliente cliente, double montoSolicitado) {
        cliente.pagar(montoSolicitado);
    }
}
