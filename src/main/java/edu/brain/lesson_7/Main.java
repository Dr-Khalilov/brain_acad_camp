package edu.brain.lesson_7;

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("Red", 3.4),
                new Rectangle("Blue", 40, 52.4),
                new Square("Green", 45)};

        for (Shape shape : shapes) {
            System.out.println(shape.getColorAndArea());
        }
    }
}
