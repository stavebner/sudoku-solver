import sudokuRepo.SudokuRepo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[][] mat = new SudokuRepo().getRandomBoard(16).getGrid();

        printSudoku(mat);
        System.out.println("Activating solver");

        sudokuSolver(mat);
        boolean solved = checkSudoku(mat);
        printSudoku(mat);

        if (solved) {
            System.out.println("Sudoku solved successfully");
        } else {
            System.out.println("Sudoku could not be solved");
        }
    }

    public static void sudokuSolver(int[][] mat) {
        sudokuSolver(mat, 0, 0);
    }

    public static boolean sudokuSolver(int[][] mat, int row, int col) {
        int size = mat.length;

        // Move to next empty cell
        while (row < size && mat[row][col] != 0) {
            col++;
            if (col == size) {
                col = 0;
                row++;
            }
        }

        // Solved
        if (row == size) return true;

        for (int num = 1; num <= size; num++) {
            if (isSafe(mat, row, col, num)) {
                mat[row][col] = num;

                if (sudokuSolver(mat, row, col))
                    return true;

                mat[row][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] mat, int row, int col, int num) {
        // Check row
        if (IntStream.of(mat[row]).anyMatch(x -> x == num)) {
            return false;
        }

        // Check column
        for (int[] rowArray : mat) {
            if (rowArray[col] == num) {
                return false;
            }
        }

        // Check box
        int boxSize = (int) Math.sqrt(mat.length);
        int boxStartRow = row - row % boxSize;
        int boxStartCol = col - col % boxSize;

        for (int boxRow = boxStartRow; boxRow < boxStartRow + boxSize; boxRow++) {
            for (int boxCol = boxStartCol; boxCol < boxStartCol + boxSize; boxCol++) {
                if (mat[boxRow][boxCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printSudoku(int[][] board) {
        int size = board.length;
        int box = (int) Math.sqrt(size);

        int cellWidth = String.valueOf(size).length(); // 1 for 9x9, 2 for 16x16
        String cellFormat = "%" + cellWidth + "d";

        printBorder(size, box, cellWidth);

        for (int r = 0; r < size; r++) {
            System.out.print("| ");

            for (int c = 0; c < size; c++) {
                System.out.printf(cellFormat, board[r][c]);
                System.out.print(" ");

                if ((c + 1) % box == 0)
                    System.out.print("| ");
            }

            System.out.println();

            if ((r + 1) % box == 0)
                printBorder(size, box, cellWidth);
        }
    }

    private static void printBorder(int size, int box, int cellWidth) {
        int cells = size * (cellWidth + 1);
        int separators = box + 1;

        int total = cells + separators * 2;

        System.out.println("-".repeat(total));
    }


    public static boolean checkSudoku(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (isSafe(mat, row, col, mat[row][col]) || mat[row][col] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}