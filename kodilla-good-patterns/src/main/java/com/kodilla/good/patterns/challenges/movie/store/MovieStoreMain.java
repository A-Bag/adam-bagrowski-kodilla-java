package com.kodilla.good.patterns.challenges.movie.store;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.showMovies(movieStore.getMovies());
    }
}
