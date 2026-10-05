package ar.edu.unq.poo2.tp7_tests.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokerStatusClasses {
    public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);

        if (esPoker(cartas)) return "Poker";
        if (esColor(cartas)) return "Color";
        if (esTrio(cartas)) return "Trio";

        return "Nada";
    }

    private boolean esPoker(List<Carta> cartas) {
        return tieneFrecuenciaDeValor(cartas, 4);
    }

    private boolean esTrio(List<Carta> cartas) {
        return tieneFrecuenciaDeValor(cartas, 3);
    }

    private boolean esColor(List<Carta> cartas) {
        String palo1 = cartas.get(0).palo();
        return cartas.stream().allMatch(carta -> carta.palo().equals(palo1));
    }

    private boolean tieneFrecuenciaDeValor(List<Carta> cartas, int cantidad) {
        List<Integer> valores = cartas.stream().map(Carta::valor).toList();

        return valores.stream().anyMatch(valor -> Collections.frequency(valores, valor) == cantidad);
    }
}