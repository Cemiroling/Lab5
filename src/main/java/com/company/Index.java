package com.company;

import java.util.Arrays;

public class Index {
    public static int ShowIndex(int num){
        int [] ms = new int[1000];
        int index;
        for(int i = 0, j = -500; i < Arrays.stream(ms).count(); i++, j ++)
            ms[i] = j;
        if(Arrays.stream(ms).anyMatch(x -> x ==num)){
            for (index = 0; index < Arrays.stream(ms).count(); index++)
                if (ms[index] == num)
                    break;
        } else index = -1;
        return index;
    }
}
