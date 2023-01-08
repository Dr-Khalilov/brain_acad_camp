package edu.brain.lesson_11;

import java.util.Arrays;

/**
 * Class MathUtil consist of some static mathematical methods: sum, multiple, factorialOfNumber, getArithmeticProgression,
 * getGeometricProgression
 */
class MathUtil {

    /**
     * Declaration static sum method which return sum of some numbers
     *
     * @param numbers double
     * @return double
     */
    public static double sum(double... numbers) {
        return Arrays.stream(numbers).sum();
    }

    /**
     * Declaration static multiple method which return multiples of some numbers
     *
     * @param numbers double
     * @return double
     */
    static double multiple(double... numbers) {
        double value = 1.0;
        for (double number : numbers) {
            value *= number;
        }
        return value;
    }


    /**
     * Declaration static factorialOfNumber method which return factorial value from some number
     *
     * @param number long
     * @return long
     */
    static long factorialOfNumber(long number) {
        long factorial = 1;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }


    /**
     * Declaration static getArithmeticProgression method which return list some items of arithmetic progression
     *
     * @param firstItem  double
     * @param difference double
     * @param quantity   int
     * @return double[]
     */
    static double[] getArithmeticProgression(double firstItem, double difference, int quantity) {
        double arithmeticItem = firstItem;
        double[] listArithmeticProgressionItems = new double[quantity];
        int count = 0;
        while (count < quantity) {
            listArithmeticProgressionItems[count] = arithmeticItem;
            arithmeticItem += difference;
            count++;
        }
        return listArithmeticProgressionItems;
    }

    /**
     * Declaration static getGeometricProgression method which return list some items of geometric progression
     *
     * @param firstItem   double
     * @param denominator int
     * @param quantity    int
     * @return double[]
     */
    static double[] getGeometricProgression(double firstItem, int denominator, int quantity) {
        double geometricItem = firstItem;
        double[] listGeometricProgressionItems = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            listGeometricProgressionItems[i] = geometricItem;
            geometricItem *= denominator;
        }
        return listGeometricProgressionItems;
    }
}
