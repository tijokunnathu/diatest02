package com.dia.test2;

import org.junit.Assert;
import org.junit.Test;

public class DogsTest {

    @Test
    public void isBaby() {
        Dogs dogs = new Dogs();
        Assert.assertEquals(true, dogs.isBaby(1));
    }
}