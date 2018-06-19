package com.kodilla.stream.beautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
public class StreamMain {
    public static void main(String []args){

       System.out.println("Building beautiful words with lambadas" );
        PoemBeautifier poemBeautifier= new PoemBeautifier();
        poemBeautifier.beauty( "aaa",word-> word.toUpperCase() );
        poemBeautifier.beauty( "AAA",word ->word.toLowerCase()  );
        poemBeautifier.beauty( "mama",word -> word.replace("a", "A"));
        poemBeautifier.beauty( "Java",word -> word.concat(" jest").concat(" super")) ;
        poemBeautifier.beauty( "mama , mama, mama",word -> word.replace( "m", "t" ) );
    }
}

