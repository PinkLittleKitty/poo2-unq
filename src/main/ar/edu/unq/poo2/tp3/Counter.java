package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class Counter {
    private ArrayList<Integer> numbersList = new ArrayList<>();

    public void addNumber(int num) {
        numbersList.add(num);
    }

    public int evenAmount() {
        int methodCounter = 0;

        for (Integer i : numbersList) {
            if (i % 2 == 0) {
                methodCounter++;
            }
        }

        return methodCounter;
    }

    public int oddAmount() {
        int methodCounter = 0;

        for (Integer i : numbersList) {
            if (i % 2 == 1) {
                methodCounter++;
            }
        }

        return methodCounter;
    }

    public int multipleAmount(int multiplier) {
        int methodCounter = 0;
        for (Integer i : numbersList) {
            if (i % multiplier == 0) {
                methodCounter++;
            }
        }

        return methodCounter;
    }
}
