package io.chikeem90.java8to11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");
//        name.forEach(System.out::println);
//        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//        while (spliterator.tryAdvance(System.out::println));
//        System.out.println("=======================");
//        while (spliterator1.tryAdvance(System.out::println));
//        name.removeIf(s -> s.startsWith("k"));
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        name.forEach(System.out::println);
    }
}
