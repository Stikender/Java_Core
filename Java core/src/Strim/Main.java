package Strim;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static <stream1, stream2> void main(String[] args) {
//  Задание 1
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(8);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.intValue() > o2.intValue()) {
                    return 1;
                } else if (o1.intValue() < o2.intValue()) {
                    return -1;
                }
                return 0;
            }
        };
         int min;
         int max;
        Stream<Integer> stream1 = list.stream()
                .min(comparator).stream();
        Stream<Integer> stream2 = list.stream()
                .max(comparator).stream();

        BiConsumer<stream1, stream2> minMaxConsumer = new BiConsumer<stream1, stream2>() {
            @Override
            public void accept(stream1 stream1, stream2 stream2) {
                System.out.println(list.stream().min(comparator));
                System.out.println(list.stream().max(comparator));
            }
        };
        minMaxConsumer.accept((stream1) stream1, (stream2) stream2);
//  Задание 2

        Stream.iterate(0, i -> i += 3)
                .limit(7)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        }
    }

