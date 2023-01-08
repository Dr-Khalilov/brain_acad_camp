package edu.brain.lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // 1
        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(!false && (false || true && true));
        System.out.println(4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));
        System.out.println();

//        // 2
        for (int i = 0; i <= 10; i++) {
            System.out.println(i % 2 == 0 ? "Чётное " + i : "Нечётное " + i);
        }
        System.out.println();

        // 3
        Scanner week = new Scanner(System.in);
        System.out.println("Write day`s name");
        String day = week.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It`s a work day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It`s a weekend");
                break;
            default:
                System.out.println("Error");
        }

        // 4
        Lesson2 lesson = new Lesson2();
        lesson.calculateFactorial((short) 7);
        System.out.println();

        // 5
        lesson.showEveryItemValue(15);
    }

    void calculateFactorial(short number) {
        short result = 1;
        for (short i = 1; i <= number; i++) {
            result = (short) (result * i);
            if (result > 1000) {
                System.out.println("Maximum possible result: " + result);
                break;
            }
            System.out.println("Intermediate value: " + result);
        }
    }

    void showEveryItemValue(int maxValue) {
        for (int item = 3; item <= maxValue; item += 3) {
            System.out.println("Each 3 item value: " + item);
        }
    }
}
