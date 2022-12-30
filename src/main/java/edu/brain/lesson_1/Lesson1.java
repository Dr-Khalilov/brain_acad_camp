package edu.brain.lesson_1;

public class Lesson1 {
    public static void main(String[] args) {
        byte number1 = 100;
        short number2 = 130;
        int number3 = 1000_000_000;
        long number4 = 1000_000_000_00L;
        float number5 = 9.81f;
        double number6 = 3.145_495;
        char number7 = 15;
        boolean bool = true;
        System.out.println(number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6 + ", " + number7 + ", " + bool);
        System.out.println();

        byte number8 = 127;
        short number9 = number8;
        int number10 = number9;
        long number11 = number10;
        int number12 = 1000_000_000;
        double number13 = number12;
        short number14 = 10000;
        float number15 = number14;
        double number16 = number15;
        char number17 = 1000;
        int number18 = number17;
        System.out.println(number8 + ", " + number9 + ", " + number10 + ", " + number11 + ", " + number12 + ", " + number13 + ", " + number14 + ", " + number15 + ", " + number16 + ", " + number17 + ", " + number18);
        System.out.println();

        int number19 = 200_000_0000;
        float number20 = number19;
        System.out.println(number19 + ", " + number20);
        System.out.println();

        byte u = 127;
        u++;
        System.out.println(u);
        System.out.println();

        byte v = 10;
        System.out.print(v % 2 == 0 ? "even number" : "odd number");
    }

}
