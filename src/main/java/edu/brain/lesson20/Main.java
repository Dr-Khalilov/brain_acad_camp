package edu.brain.lesson20;

class Main {
    public static void main(String[] args) {
        String[] listStrings = {"11111", "22222222", "33333333", "444",
                                "11", "222", "3333", "4444444",
                                "11111111", "222222", "33333333", "4",
                                "1", "2222222222", "3", "444444444444444", "555555555555555"};

        TableFormatter formatter = new TableFormatter(4, 4, listStrings);
        formatter.printTable();
    }
}
