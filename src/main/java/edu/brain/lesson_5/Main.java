package edu.brain.lesson_5;

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Body body1 = new Body();
        Body body2 = new Body();
        Body body3 = new Body();
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Engine engine3 = new Engine();
        Transmission transmission1 = new Transmission();
        Transmission transmission2 = new Transmission();
        Transmission transmission3 = new Transmission();

        car3.setBrand("Tesla");
        car3.setModel("Model 3");
        car3.setPrice(50000);
        body3.setColour("White");
        body3.setType("Sedan");
        engine3.setType("Electric motor");
        engine3.setPower(258);
        transmission3.setType("1");
        transmission3.setGear("Automatic");
        System.out.println(car3 + " " + body3 + " " + engine3 + " " + transmission3);

        car3.setBrand("Alfa Romeo");
        car3.setModel("Giulia");
        car3.setPrice(47093);
        body3.setType("Sedan");
        body3.setColour("Red");
        engine3.setType("internalCombustionEngine");
        engine3.setPower(510);
        transmission3.setType("V8");
        transmission3.setGear("Automatic");
        System.out.println(car3 + " " + body3 + " " + engine3 + " " + transmission3);

        car3.setBrand("Aston Martin");
        car3.setModel("Vantage");
        car3.setPrice(166132);
        body3.setType("Sedan 2+0");
        body3.setColour("Gray");
        engine3.setType("internalCombustionEngine");
        engine3.setPower(503);
        transmission3.setType("V8");
        transmission3.setGear("Mechanic");
        System.out.println(car3 + " " + body3 + " " + engine3 + " " + transmission3);
        car3.setPrice(car3.getPrice() + 2000); //повышаем цену на 2000
        System.out.println(car3);
        body3.setColour("Blue");// перекрашиваем авто
        System.out.println(body3);
        engine3.setPower(engine3.getPower() * 120 / 100); // повышаем мощность двигателя на 20%
        System.out.println(engine3);
        body3.setType("Pickup");// меняем тип кузова
        System.out.println(body3);
        System.out.println(transmission3.getGear());
        transmission3.setGear("Automatic"); // Т.к. это тип данных стринг то меняем значение передачи через сет
        System.out.println(transmission3.getGear());
    }
}
