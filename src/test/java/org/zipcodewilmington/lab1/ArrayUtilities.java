package org.zipcodewilmington.lab1;

import java.util.Arrays;

public class ArrayUtilities {
    public static void moveLastToFirst(int[] values) {
        int[] answer = Arrays.copyOf(values, values.length);

        for (int i = 1; i < values.length; i++) {
            if (values.length == 1) {
                break;
            } else {
                int originalValatLastIndex = values[values.length - 1];
                values[i] = answer[i - 1];
                values[0] = originalValatLastIndex;
            }
        }
    }
}
