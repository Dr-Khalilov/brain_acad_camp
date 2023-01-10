package edu.brain.lesson20;

class TableFormatter {
    private final int rows;
    private final int columns;
    private final String[][] table;

    TableFormatter(int rows, int columns, String... listStrings) {
        this.rows = rows;
        this.columns = columns;
        this.table = buildMatrix(listStrings);
    }


    private int getLongestWordSizeInColumn(String[] listWords) {
        int maxSize = 0;
        for (String word : listWords) {
            if (word.length() > maxSize) {
                maxSize = word.length();
            }
        }
        return maxSize;
    }

    private String[][] buildMatrix(String... listStrings) {
        String[][] matrix = new String[rows][columns];
        int listIndex = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = listStrings[listIndex++];
            }
        }
        return alignTable(matrix);
    }

    private String[][] alignTable(String[][] table) {
        String[][] alignedTable = new String[rows][columns];
        String[] stringsColumn = new String[columns];
        String[] alignedColumns = new String[columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                stringsColumn[column] = table[column][row];
                if (column == columns - 1) {
                    int longestWordSize = getLongestWordSizeInColumn(stringsColumn);
                    int index = 0;
                    for (String string : stringsColumn) {
                        String alignedString;
                        int different = longestWordSize - string.length();
                        if (different > 0) {
                            alignedString = string + (" ".repeat(different));
                            alignedColumns[index] = alignedString;
                        } else {
                            alignedColumns[index] = string;
                        }
                        index++;
                    }
                }
            }
            for (int column = 0; column < columns; column++) {
                alignedTable[column][row] = alignedColumns[column];
            }
        }
        return alignedTable;
    }

    void printTable() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(table[row][column] + "    ");
            }
            System.out.println();
        }
    }
}
