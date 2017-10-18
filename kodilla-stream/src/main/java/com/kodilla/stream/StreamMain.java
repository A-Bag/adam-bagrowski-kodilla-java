package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aAa", (text) -> "*" + text + "*");
        poemBeautifier.beautify("aAa", (text) -> text.toUpperCase());
        poemBeautifier.beautify("aAa", (text) -> text.toLowerCase());
        poemBeautifier.beautify("aAa", (text) -> text.substring(1,2));
    }
}
