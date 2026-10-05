package ar.edu.unq.poo2.tp7_tests.classes;

public class Carta {
    private int valor;
    private String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int valor() {
        return valor;
    }

    public String palo() {
        return palo;
    }

    public boolean esMayorQue(Carta carta) {
        return this.valor() > carta.valor();
    }
}
