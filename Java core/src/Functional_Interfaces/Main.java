package Functional_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static <T, U> void main(String[] args) {

        Person mike = new Person("Mike", 15);
        Person sam = new Person("Sam", 0);
        Person kat = new Person("Kat", 29);

        List<Person> people = new ArrayList<>();
        people.add(mike);
        people.add(sam);
        people.add(kat);
//  Задание 1 Predicate//
//        Predicate<Person> predicate = new Predicate <Person>() {
//            @Override
//            public boolean test(Person person) {
//                    return person.getAge() >= 0;
//            }
//        };
//        Predicate<Person> predicate1 = person -> person.getAge() >= 0;
//
//        people.removeIf(predicate);
//
//        for (Person person : people) {
//            System.out.println(person);
//        }
//  Задание 2 Consumer//
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Приветствую " + person.getName());
            }
        };
        Consumer<Person> personConsumer1 = person -> System.out.println("Приветствую " + person.getName());
        people.forEach(personConsumer);
//  Задание 3 Function//
        Function<Double, Long> convertNumbers = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };

        Function<Double, Long> convertNumbers1 = aDouble -> aDouble.longValue();
        System.out.println(convertNumbers.apply(10.95225584584));
//  Задание 4 Supplier//

        Supplier<Integer> freeNumbers = new Supplier<Integer>() {
            @Override
            public Integer get() {
                int max = 100;
                return (int) (Math.random() * ++max);
            }
        };
        AtomicInteger max = new AtomicInteger(100);
        Supplier<Integer> freeNumbers1 = ()-> (int) (Math.random() * max.incrementAndGet());
        System.out.println(freeNumbers.get());
//  Задание 5 комбинирование функций//

        Predicate<Person> predicate1 = person -> person.getAge() == 0 ? person.getAge() < 0 : person.getAge() > 0;

            System.out.println(predicate1.test(mike));
    }

}
