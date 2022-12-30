package edu.brain.lesson_6;

class Circle {
    private String color;
    private final double radius;
    private final double circumference;
    private final double area;

    public Circle(double radius) {
        this.radius = radius;
        this.circumference = 2 * Math.PI * this.radius;
        this.area = this.radius * this.radius * Math.PI;
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
        this.circumference = this.radius * 2 * Math.PI;
        this.area = Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", circumference=" + circumference +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle("Blue", 10);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
