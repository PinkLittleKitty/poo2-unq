package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List<Integer> numbersList = new ArrayList<Integer>();

    public void addNumber(int num) {
        numbersList.add(num);
    }

    public int evenAmount() {
        int amount = 0;

        for (Integer i : numbersList) {
            if (i % 2 == 0) {
                amount++;
            }
        }

        return amount;
    }

    public int oddAmount() {
        int amount = 0;

        for (Integer i : numbersList) {
            if (i % 2 == 1) {
                amount++;
            }
        }

        return amount;
    }

    public int multipleAmount(int multiplier) {
        int amount = 0;
        for (Integer i : numbersList) {
            if (i % multiplier == 0) {
                amount++;
            }
        }

        return amount;
    }

    public int mostEvenDigits() {
        int bestYet = numbersList.getFirst();
        int maxEven = countEven(bestYet);

        for (int i : numbersList) {
            int currentEven = countEven(i);

            if (currentEven > maxEven) {
                maxEven = currentEven;
                bestYet = i;
            }
        }

        return bestYet;
    }

    public int countEven(int n) {
        if (n == 0) { // Caso borde, 0 tiene un sólo dígito y es par.
            return 1;
        }

        n = Math.abs(n); // hacemos positivos los números negativos.

        int amount = 0;

        while (n > 0) {
            int digit = n % 10; // Extraemos el último dígito.

            if (digit % 2 == 0) {
                amount++;
            }

            n = n / 10; // Descartamos el dígito restante.
        }

        return amount;
    }

    public int biggestMultipleFor(int x, int y) {
        if (x <= 0 || y <= 0) {
            return -1;
        }

        for (int i = 1000; i > 0; i--) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return -1;
    }
}
