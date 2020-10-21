package io.chikeem90.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                // 외부에 선언된 변수 baseNumber를 가린다.
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            // 외부에 선언된 변수 baseNumber를 가린다.
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };

        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);
        printInt.accept(10);
    }
}
