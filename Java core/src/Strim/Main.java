package Strim;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//  Задание 1
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(8);
        Stream stream = list.stream();
        findMinMax(stream, Integer::compareTo,
                (min, max) -> System.out.println("Минимальное число - " + min + ", Максимальное число - " + max));

//  Задание 2

        numberEven(list);
    }
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> comparator,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> list = stream
                .sorted(comparator)
                .collect(Collectors.toList());
        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));

    }

    public static void numberEven (List<Integer> list) {
        long count = list.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println("Количество четных чисел равно - " + count);
    }
}


