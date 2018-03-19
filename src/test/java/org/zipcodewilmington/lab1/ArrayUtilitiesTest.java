package org.zipcodewilmington.lab1;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayUtilitiesTest {

    @Test
    public void testMoveLastToFirstWithOneItem(){
        int[] values = {4};
        int[] expected = {4};
        ArrayUtilities.moveLastToFirst(values);
        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void testMoveLastToFirstWithTwoItems(){
        int[] values = {13, 8};
        int[] expected = {8, 13};
        ArrayUtilities.moveLastToFirst(values);
        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void testMoveLastToFirst(){
        int[] values = {4, 6, 2, 9};
        int[] expected = {9, 4, 6, 2};
        ArrayUtilities.moveLastToFirst(values);
        Assert.assertArrayEquals(expected, values);
    }

    @Test
    public void testRemoveDuplicateWithOnlyOneItem(){
        int[] values = {12};
        int[] expected = {12};
        int[] actual = ArrayUtilities.removeDuplicate(values);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicateWithSameValue(){
        int[] values = {5, 5};
        int[] expected = {5};
        int[] actual = ArrayUtilities.removeDuplicate(values);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicate(){
        int[] values = {4, 4, 6, 2, 9, 9, 9, 9};
        int[] expected = {4, 6, 2, 9};
        int[] actual = ArrayUtilities.removeDuplicate(values);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMeanWithOneItem(){
        int[] values = {5};
        double expected = 5.0;
        double actual = ArrayUtilities.mean(values);
        Assert.assertEquals(expected, actual, 0.10);
    }

    @Test
    public void testMeanWithTwoItem(){
        int[] values = {2, 4};
        double expected = 3.0;
        double actual = ArrayUtilities.mean(values);
        Assert.assertEquals(expected, actual, 0.10);
    }

    @Test
    public void testMean(){
        int[] values = {3, 5, 8, 1};
        double expected = 4.25;

        double actual = ArrayUtilities.mean(values);
        Assert.assertEquals(expected, actual, 0.10);
    }
}
