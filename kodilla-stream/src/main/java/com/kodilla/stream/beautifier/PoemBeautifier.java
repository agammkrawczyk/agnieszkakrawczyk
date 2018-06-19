package com.kodilla.stream.beautifier;
import  com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifier {
    public void beauty(String word, PoemDecorator poemDecorator) {
        String result = poemDecorator.beautyWord( word );
        System.out.println( " Beauty result is:" + result );
    }
}