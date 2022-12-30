package edu.brain.lesson_7;

class Square extends Shape {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calcArea() {
        return Math.pow(this.side, 2);
    }
}
