package edu.brain.lesson8;

class Library {
    private final String name;
    private Film[] films;

    public Library(String name) {
        this.name = name;
        System.out.println("The Library " + this.name + " successfully created!");
    }

    {
        films = new Film[5];
        films[0] = new Film("Matrix", 140, Genre.SINCE_FICTION);
        films[1] = new Film("The Hobbit", 195, Genre.FANTASY);
        System.out.println("Favorite films was added");
    }

    public String getName() {
        return name;
    }

    public Film[] getFilms() {
        return films;
    }

    public void setFilms(Film film, int index) {
        films[index] = film;
    }

    public int getFirstEmptyCellInArray(Film[] listOfFilms) {
        int length = listOfFilms.length;
        for (int film = 0; film < length; film++) {
            if (listOfFilms[film] == null) {
                return film;
            }
        }
        return -1;
    }
}
