package com.company;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Amount {
    public static long CombinationAmount(int num){
        long amount;
        if (num > 0) {
            Integer[] ms = new Integer[num - 1];
            for (int i = 1; i < num - 1; i++)
                ms[i - 1] = i;
            amount = Arrays.stream(ms).count();
        }
        else amount = -1;
        return amount;
    }
}
