package org.zipcodewilmington.lab1;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testRunWithOnlyNumber(){
        int number = 2;
        String expected = "1 2";
        String actual = FizzBuzz.run(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunWithFizz(){
        int number = 4;
        String expected = "1 2 Fizz 4";
        String actual = FizzBuzz.run(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunWithFizzAndBuzz(){
        int number = 7;
        String expected = "1 2 Fizz 4 Buzz Fizz 7";
        String actual = FizzBuzz.run(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRunWithFizzBuzz(){
        int number = 16;
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16";
        String actual = FizzBuzz.run(number);
        Assert.assertEquals(expected, actual);
    }
}
