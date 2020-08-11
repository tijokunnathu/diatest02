package com.dia.test2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private Double age;
    public boolean isBaby(double age)
    {
        if(age < 1)
        {
            return true;
        }
        else {
            System.out.println("Age is " + age);
            return false;
        }

    }
}
