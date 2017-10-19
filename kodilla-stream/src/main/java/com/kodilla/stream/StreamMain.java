package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aAa", (text) -> "*" + text + "*");
        poemBeautifier.beautify("aAa", (text) -> text.toUpperCase());
        poemBeautifier.beautify("aAa", (text) -> text.toLowerCase());
        poemBeautifier.beautify("aAa", (text) -> text.substring(1,2));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
