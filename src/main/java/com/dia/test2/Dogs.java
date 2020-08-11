package com.dia.test2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@ToString
public class Dogs extends Animal {

    private String color;

    public Dogs(String color, Double age) {
        this.color = color;
        super.setAge(age);
    }

    public Dogs() {

    }

    @Override
    public boolean isBaby(double age) {
        if (age < 2)
            return true;
        else
            return false;
    }

    public List addDogsDetails() {
        List<Dogs> dogs = Arrays.asList(new Dogs("green", .5), new Dogs("red", 1.0)
                , new Dogs("blue", 1.5), new Dogs("yellow", 2.0));
        return dogs;
    }
    public void allDogs(List<Dogs> dogs){
        System.out.println("List of all dogs \n");
        dogs.stream().forEach(puppy -> System.out.println("dog color :"+ puppy.getColor()
                +" "+ "dog age :"+ puppy.getAge()));
    }

    public void filterOutPuppies(List<Dogs> dogs) {
        List<Dogs> puppies = new ArrayList<>();
        System.out.println("List of all puppies \n");
        puppies = dogs.parallelStream().filter(puppy -> puppy.getAge() < 1).collect(Collectors.toList());
        puppies.stream().forEach(puppy -> System.out.println("puppy color :"+ puppy.getColor()
                            +" "+ " puppy age :"+ puppy.getAge()));
    }
}
