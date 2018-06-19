package com.kodilla.stream.beautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.references.BeautyBuilder;
public class StreamMain {
    public static void main(String []args){

       System.out.println("Building beautiful words with lambadas" );
        PoemBeautifier poemBeautifier= new PoemBeautifier();
        poemBeautifier.beauty( "aaa",word-> word.toUpperCase() );
        poemBeautifier.beauty( "AAA",word ->word.toLowerCase()  );
        poemBeautifier.beauty( "mama",word -> word.replace("a", "A"));
        poemBeautifier.beauty( "Java",word -> word.concat(" jest").concat(" super")) ;
        poemBeautifier.beauty( "mama , mama, mama",word -> word.replace( "m", "t" ) );


   System.out.println("Building beautifulr words with references");
   poemBeautifier.beauty( "bbbbbb",BeautyBuilder::bigLetters );
   poemBeautifier.beauty( "BBBBB",BeautyBuilder::smallLetters);


    }
}

