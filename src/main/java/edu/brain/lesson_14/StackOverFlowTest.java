package edu.brain.lesson_14;

class StackOverFlowTest {
    static int count;

    static void test() {
        count++;
        System.out.println(count);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
