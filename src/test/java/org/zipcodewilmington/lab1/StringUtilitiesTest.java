package org.zipcodewilmington.lab1;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilitiesTest {

    @Test
    public void testUniqueStringWithOneRepeatingValue(){
        String value = "aaa";
        String expected = "a";
        String actual = StringUtilities.unique(value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUniqueStringWithMultipleValues(){
        String value = "abracadabra";
        String expected = "abrcd";
        String actual = StringUtilities.unique(value);
        Assert.assertEquals(expected, actual);
    }


}
