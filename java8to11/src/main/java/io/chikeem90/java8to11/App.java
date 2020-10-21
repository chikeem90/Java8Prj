package io.chikeem90.java8to11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        Function<String, Greeting> doyeonGreeting = Greeting::new;
        Greeting doyeon = doyeonGreeting.apply("doyeon");
        System.out.println(doyeon.getName());
        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();
        String[] names = {"keesun", "whiteship", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
