package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> newIntList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            Integer x = intList.get(i);
            if (x > 0 & x % 2 == 0) {
                newIntList.add(x);
            }

        }
        Collections.sort(newIntList);
        System.out.println("Без помощи StreamAPI:");
        for (int counter : newIntList) {
            System.out.println(counter);
        }

        StreamMain.printStreamMain();

    }
}
