package edu.brain.lesson_11;

import java.util.Arrays;

class Main {
    /**
     * Call static methods of class MathUtil with different arguments
     */
    public static void main(String[] args) {
        System.out.println(MathUtil.sum(1, 2, 3, 4));
        System.out.println(MathUtil.multiple(1, 2, 3));
        System.out.println(MathUtil.multiple(1, 2, 3, 4));
        System.out.println(MathUtil.factorialOfNumber(5));
        System.out.println(MathUtil.factorialOfNumber(0));

        double[] arithmeticItems = MathUtil.getArithmeticProgression(1, 4, 20);
        double[] geometricItems = MathUtil.getGeometricProgression(1, 2, 20);

        System.out.println(Arrays.toString(arithmeticItems));
        System.out.println(Arrays.toString(geometricItems));
    }
}
