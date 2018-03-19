package org.zipcodewilmington.lab1;

public class FizzBuzz {
    public static String run(int number) {
        String answer = "";
        for (int i = 1; i < number; i++){
            if (i % 15 == 0){
                answer += "FizzBuzz ";
            } else if (i % 5 == 0){
                answer += "Buzz ";
            } else if (i % 3 == 0){
                answer += "Fizz ";
            } else {
                answer += i + " ";
            }
        }

        answer += number;

        return answer;
    }
}
