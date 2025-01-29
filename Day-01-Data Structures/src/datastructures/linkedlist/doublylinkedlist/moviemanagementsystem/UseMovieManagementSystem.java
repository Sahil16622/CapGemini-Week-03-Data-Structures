package datastructures.linkedlist.doublylinkedlist.moviemanagementsystem;

public class UseMovieManagementSystem {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtBeginning("Titanic", "James Cameron", 1997, 7.9);
        movieList.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 2);

        System.out.println("Movie Records (Forward Order):");
        movieList.displayForward();

        System.out.println("\nUpdating Rating for 'Interstellar' to 9.1:");
        movieList.updateRating("Interstellar", 9.1);
        movieList.displayForward();

        System.out.println("\nSearching for movies by Christopher Nolan:");
        movieList.searchByDirector("Christopher Nolan");

        System.out.println("\nSearching for movies with Rating 8.8:");
        movieList.searchByRating(8.8);

        System.out.println("\nRemoving 'Titanic':");
        movieList.removeByTitle("Titanic");
        movieList.displayForward();

        System.out.println("\nMovie Records (Reverse Order):");
        movieList.displayReverse();
    }
}
