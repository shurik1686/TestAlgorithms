package ru.shurik16.testalgorithms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountMax {


    //Search Stream
    public static List<Integer> repeatedNumberS(List<Integer> integerList, int sizeResult) {

        return integerList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(sizeResult)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static int repeatedNumber(final List<Integer> list) {

        int itemRez = 0;
        int countRez = 0;

        for (int x : list) {
            int count = 0;
            for (int k : list) {
                if (x == k) {
                    count++;
                }
            }

            if (countRez < count) {
                countRez = count;
                itemRez = x;
            }

        }

        return itemRez;
    }

    public static int repeatedNumber1(final List<Integer> list) {

        Map<Integer, Integer> counts = new HashMap<>();

        for (int n : list) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        int max = Collections.max(counts.values());

        for (int k : counts.keySet()) {
            if (counts.get(k) == max) {
                return k;
            }
        }

        return -1;
    }

    public static int repeatedNumber2(final List<Integer> list) {

        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> counter = new TreeMap<>();

        for (int n : list) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        counts.forEach((key, value) -> counter.put(value, key));

        Object[] rezArray = counter.values().toArray();

        return (int) rezArray[rezArray.length - 1];
    }

    public static Object[] repeatedNumber3(final List<Integer> list, int sizeResult) {

        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> counter = new TreeMap<>();

        for (int n : list) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        counts.forEach((key, value) -> counter.put(value, key));

        List<Integer> t = new LinkedList<>(counter.values());
        Collections.reverse(t);
        Object[] rezArray = t.toArray();

        return Arrays.copyOf(rezArray, sizeResult);
    }

}
