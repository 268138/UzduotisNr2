package org.example;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] skaiciai = {1, 2, 3, 4, 5};

        int min = Ints.min(skaiciai);
        int max = Ints.max(skaiciai);

        int reiksme = 3;
        boolean contains = Ints.contains(skaiciai, reiksme);
        System.out.println("Ar skaiciu eileje yra reikalinga reiksme " + reiksme + ". Jeigu yra,  isvesk - " + contains);

        List<Integer> integerList = Ints.asList(skaiciai);
        System.out.println("Integeriu sarasas: " + integerList);

        Integer[] integerArray = integerList.toArray(new Integer[0]);
        System.out.println("Primityvus Integer array:" + Arrays.toString(integerArray));

    }
}
