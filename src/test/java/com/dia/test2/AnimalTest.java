package com.dia.test2;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void isBaby() {
        Animal animal = new Animal();
        Assert.assertEquals(true, animal.isBaby(0.5));
    }
}