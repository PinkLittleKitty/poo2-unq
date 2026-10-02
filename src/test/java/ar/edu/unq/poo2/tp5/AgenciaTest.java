package ar.edu.unq.poo2.tp5;

public class AgenciaTest implements Agencia { // Revisar la última teoría, respecto a los Test Doubles.
    private int pagosRegistrados = 0;
    private Factura ultimaFacturaRegistrada;

    @Override
    public void registrarPago(Factura factura) {
        this.pagosRegistrados++;
        this.ultimaFacturaRegistrada = factura;
    }

    public int getPagosRegistrados() {
        return pagosRegistrados;
    }

    public Factura getUltimaFacturaRegistrada() {
        return ultimaFacturaRegistrada;
    }
}
