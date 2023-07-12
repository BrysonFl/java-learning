package com.steven.streams;

import java.util.stream.Stream;

public class ExampleStreams {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("Bryson", "César", "Brian", "asdasdasdasd");

        names.filter(x -> x.length() > 5).forEach(System.out::println);

    }
}
