package edu.brain.lesson_12;

import java.util.Scanner;

import static java.lang.System.out;

class StringTest {
    public static void main(String[] args) {
        String str1 = "I`m Java Developer";
        out.println(str1);

        String str2 = new String("I developer on Java");
        out.println(str2);

        char[] str3 = {'J', 'a', 'v', 'a'};
        out.println(str3);

        String str4 = "Java is doing me better";
        String str5 = new String(str4.getBytes());
        out.println(str5);

        StringBuilder built = new StringBuilder("I love Java");
        String str6 = new String(built);
        out.println(str6);
        out.println("----------------------------------------");

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruit = fruits.split(",");
        int i = 1;
        String longWord = fruit[0];
        do {
            if (longWord.length() < fruit[i].length()) {
                longWord = fruit[i];
            }
            i++;
        } while (i < fruit.length);
        out.println(longWord.toLowerCase());
        out.println(longWord.substring(0, 3));

        String str7 = "   Я_новая_строка      ";
        String trimmedString = str7.trim();
        String replacedStr = trimmedString.replace("_", " ");
        out.println(replacedStr);
        out.println("-----------------------------------------------");

        Scanner scan = new Scanner(System.in);
        String Str8 = scan.nextLine();
        out.println("Вы ввели: " + Str8);
        if (Str8.startsWith("Run")) {
            out.println("We run the process");
        } else if (Str8.endsWith("completed")) {
            out.println("The process was completed");
        } else if (Str8.equalsIgnoreCase("error")) {
            out.println("An error has been");
        }
        scan.close();
        out.println("---------------------------------------------------");

        StringBuilder builder = new StringBuilder(str1 + " " + str2 + " " + str4 + "\n " + str6
                + " " + fruits + " " + str7.trim() + "\n " + Str8);
        out.println(builder.reverse());
        out.println(builder);
    }
}
