package edu.brain.lesson_6;

class Pizza {
    private final Circle basis;
    private final String composition;
    private final String name;
    private final float price;


    public Pizza(String name, String composition, double radius, float price) {
        this.basis = new Circle(radius);
        this.composition = composition;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + (basis.getRadius() * 2) + " sm" + '\'' +
                ", area=" + basis.getArea() + " sm2" + '\'' +
                ", circumference=" + basis.getCircumference() + " sm" + '\'' +
                ", composition='" + composition + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
