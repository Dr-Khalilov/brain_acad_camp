package edu.brain.lesson20;

class TableFormatter {
    public static void main(String[] args) {
        String[] listStrings = {"11111", "22222222", "33333333", "444", "11", "222", "3333", "4444444",
                "11111111", "222222", "33333333", "4", "1", "2222222222", "3", "444444444444444"};

        buildTable(listStrings);
    }

    static void buildTable(String[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println();
        }
    }
}
