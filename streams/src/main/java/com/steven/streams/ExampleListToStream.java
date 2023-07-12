package com.steven.streams;

import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class ExampleListToStream {
    public static void main(String[] args) {

        List<String> names = new Vector<>();

        names.add("Bryson");
        names.add("César");
        names.add("Brian");
        names.add("Agusto");
        names.add("Diana");

        Stream<String> namesStream = names.stream();

        namesStream.forEach(System.out::println);

    }
}
