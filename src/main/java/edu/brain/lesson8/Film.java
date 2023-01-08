package edu.brain.lesson8;

class Film {
    private String name;
    private float duration;
    private Enum<Genre> genre;

    public Film(String name, float duration, Enum<Genre> genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("The film " + this.name + " successfully created.");
    }

    {
        System.out.println("A new film is being made.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Enum<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Enum<Genre> genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                '}';
    }
}
