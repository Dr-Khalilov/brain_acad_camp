package edu.brain.lesson_4;

class Book {
    private final static String PUBLISHER = "Ababahalamaha";
    private final String AUTHOR;
    private String name;
    private int pages;

    public Book(String author, String name) {
        this.AUTHOR = author;
        this.name = name;
    }

    String getProgressReadByPage(int page) {
        return page * 100 / this.pages + "%";
    }

    public String getPublisher() {
        return PUBLISHER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAUTHOR() {
        return this.AUTHOR;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "class Book{" +
                "AUTHOR='" + AUTHOR + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
