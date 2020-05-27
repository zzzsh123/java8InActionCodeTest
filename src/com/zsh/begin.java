package com.zsh;

import java.util.stream.Stream;

public class begin {

    public static void main(String[] args) {
        Stream.of("Hello JAVA8").forEach(System.out::println);
    }

}
