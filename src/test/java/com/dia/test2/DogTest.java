package com.dia.test2;

import com.dia.test2.components.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void isBaby() {
        Dog dog = new Dog();
        Assert.assertEquals(true, dog.isBaby(1));
    }
}