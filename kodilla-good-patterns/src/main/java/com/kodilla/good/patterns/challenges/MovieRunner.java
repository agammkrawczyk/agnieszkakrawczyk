package com.kodilla.good.patterns.challenges;
import java.util.stream.Collectors;


public class MovieRunner {

    public static void main(String args[]) {
        MovieStore movieStore = new MovieStore();

        String movieExclamationJoining = movieStore.getMovies().entrySet().stream()
                .flatMap( entry -> entry.getValue().stream() )
                .collect( Collectors.joining( "!" ) );
        System.out.println( movieExclamationJoining );
    }
}