package org.zipcodewilmington.lab1;

public class StringUtilities {
    String input;

    public static String unique(String value) {
        String answer = "";

        for (int i = 0; i < value.length(); i++){
            if(!answer.contains(String.valueOf(value.charAt(i)))){
                answer+= String.valueOf(value.charAt(i));
            }
        }

        return answer;
    }
}
