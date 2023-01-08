package edu.brain.lesson7;

abstract class Shape {
    private final String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String getColorAndArea() {
        return "Color: " + this.color + ", area: " + this.calcArea();
    }
}
