package ar.edu.unq.poo2.tp7_tests.stringImplementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokerStatus {
    public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
        List<String> valores = Arrays.asList(valor(carta1), valor(carta2),  valor(carta3), valor(carta4), valor(carta5));
        List<String> palos = Arrays.asList(palo(carta1), palo(carta2), palo(carta3), palo(carta4), palo(carta5));

        boolean hayPoker = false;
        boolean hayTrio = false;
        for (String valor : valores){
            var r = Collections.frequency(valores, valor);

            if (r >= 4) {
                hayPoker = true;
            } else if (r == 3) {
                hayTrio = true;
            }
        }

        boolean hayColor = Collections.frequency(palos, palos.get(0)) == 5;

        if (hayPoker) {
            return "Poker";
        } else if (hayColor) {
            return "Color";
        }  else if (hayTrio) {
            return "Trio";
        }

        return "Nada";
    }

    private String valor(String carta) {
       return carta.substring(0, carta.length() -1);
    }

    private String palo(String carta) {
        return carta.substring(carta.length() -1);
    }
}
