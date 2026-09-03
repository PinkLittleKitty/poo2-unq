package ar.edu.unq.poo2.tp3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Multioperator {
    private List<Integer> numList = new ArrayList<Integer>();

    public void add(Collection<Integer> nums) {
        numList.addAll(nums);
    }

    public int operateListWith(IntBinaryOperator op) {
        int result = this.numList.get(0);

        for (int i = 1; i < numList.size(); i++) {
            result = op.applyAsInt(result, numList.get(i));
        }

        return result;
    }
}
