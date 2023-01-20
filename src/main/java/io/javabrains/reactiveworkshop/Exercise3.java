package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<User> userList = ReactiveSources.userFlux().toStream().toList();
        System.out.println("List is : " + userList);
        System.out.println("Size is : " + userList.size());


        System.out.println("Press a key to end");
        System.in.read();
    }

}
