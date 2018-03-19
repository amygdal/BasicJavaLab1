package org.zipcodewilmington.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static int[] removeDuplicate(int[] values) {

        List<Integer> answerList = new ArrayList<Integer>();

        for (Integer element: values){
            if (!answerList.contains(element)){
                answerList.add(element);
            }
        }

        int[] answerArray = new int[answerList.size()];
        for (int i =0; i < answerArray.length; i++){
            answerArray[i] = answerList.get(i);
        }

        return answerArray;

    }

    public static double mean(int[] values) {
        double sum = 0.0;
        for (double element: values){
            sum += element;
        }


        return sum/values.length;
    }
}
