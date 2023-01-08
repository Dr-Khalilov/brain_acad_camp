package edu.brain.lesson_16;

class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {120, 110, 100, 1505, 2000, 42212};
        printArray(arr, 0, 4);
        printArray(arr, 2, 4);
        printArray(arr, 3, 6);
    }

    static void printArray(int[] array, int start, int end) {
        try {
            System.out.println("from " + start + " to " + end);
            for (int i = start; i <= end; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
