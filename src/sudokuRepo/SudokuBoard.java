package sudokuRepo;

import java.util.List;
import java.util.stream.IntStream;

public class SudokuBoard {
    private final int[][] grid;

    private final List<RuleOptions> rules;

    public SudokuBoard(int[][] grid, List<RuleOptions> rules) {
        this.grid = copy(grid);
        this.rules = rules;
    }

    public int getBoardSize() {
        return grid.length;
    }

    public List<RuleOptions> getRules() {
        return rules;
    }

    public int[][] getGrid() {
        return copy(grid);
    }

    private int[][] copy(int[][] original) {
        int[][] c = new int[original.length][];
        for (int i = 0; i < original.length; i++)
            c[i] = original[i].clone();
        return c;
    }

    public void printSudoku() {
        int size = grid.length;
        int box = (int) Math.sqrt(size);

        int cellWidth = String.valueOf(size).length(); // 1 for 9x9, 2 for 16x16
        String cellFormat = "%" + cellWidth + "d";

        printBorder(size, box, cellWidth);

        for (int r = 0; r < size; r++) {
            System.out.print("| ");

            for (int c = 0; c < size; c++) {
                System.out.printf(cellFormat, grid[r][c]);
                System.out.print(" ");

                if ((c + 1) % box == 0)
                    System.out.print("| ");
            }

            System.out.println();

            if ((r + 1) % box == 0)
                printBorder(size, box, cellWidth);
        }
    }

    public SudokuBoard sudokuSolver() {
        int[][] mat = getGrid();
        sudokuSolver(mat, 0, 0);

        return new SudokuBoard(mat, rules);
    }

    private boolean sudokuSolver(int[][] mat, int row, int col) {
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

    public boolean isSolvedSudokuBoard() {
        int[][] mat = getGrid();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (isSafe(mat, row, col, mat[row][col]) || mat[row][col] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isSafe(int[][] mat, int row, int col, int num) {
        return rules.stream().allMatch(rule -> rule.getRule().isSafe(mat, row, col, num));
    }

    private void printBorder(int size, int box, int cellWidth) {
        int cells = size * (cellWidth + 1);
        int separators = box + 1;

        int total = cells + separators * 2;

        System.out.println("-".repeat(total));
    }
}

