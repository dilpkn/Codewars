package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> A = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        List <Integer> B = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));
        A.removeAll(B);
        return A.stream().mapToInt(Integer::intValue).toArray();
    }

}
