package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2}; int [] b = {1};
        System.out.println(Arrays.toString(Kata.arrayDiff(a,b)));
    }
}