package edu.brain.lesson8;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Library library = new Library("Kinoman");
        System.out.println(Arrays.toString(library.getFilms()));

        boolean isCheck = true;
        while (isCheck) {
            int index = library.getFirstEmptyCellInArray(library.getFilms());
            if (index == -1) {
                System.out.println("You are out of limit");
                isCheck = false;
            } else {
                library.setFilms(new Film("Naruto", 25, Genre.ANIME), index);
            }
        }

        System.out.println(Arrays.toString(library.getFilms()));
    }
}
