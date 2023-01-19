package io.javabrains.reactiveworkshop;

import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
//        System.out.println("Exercise 1");
//        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));
//        System.out.println("Exercise 2");
//        // Print numbers from intNumbersStream that are less than 5
//        StreamSources.intNumbersStream().
//                filter(e -> e < 5).
//                forEach(System.out::println);
//        System.out.println("Exercise 3");
//        // Print the second and third numbers in intNumbersStream that's greater than 5
//        StreamSources.intNumbersStream().
//                filter(e -> e > 5).
//                skip(1).
//                limit(2).
//                forEach(System.out::println);
//        System.out.println("Exercise 4");
//        //  Print the first number in intNumbersStream that's greater than 5.
//        //  If nothing is found, print -1
//        StreamSources.intNumbersStream().
//                filter(e -> e > 5).
//                findFirst().
//                ifPresentOrElse(System.out::println, () -> System.out.print("-1"));
//        System.out.println("Exercise 5");
//        // Print first names of all users in userStream
//        StreamSources.userStream()
//                .map(e -> e.getFirstName())
//                .forEach(System.out::println);
//        System.out.println("Exercise 6");
        // Print first names in userStream for users that have IDs from number stream
//        StreamSources.userStream()
//                .filter(e->
//                        StreamSources.intNumbersStream().anyMatch(i->i==e.getId()))
//                .forEach(System.out::println);

//        StreamSources.userStream()
//                .filter(user -> StreamSources.intNumbersStream().anyMatch(e -> e == user.getId()))
//                .forEach((x) -> System.out.println(x.getFirstName()));
//
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(e -> e == user.getId()))
                .flatMap(user -> Stream.of(user.getFirstName(), user.getLastName()))
                .forEach(System.out::println);


    }
}
