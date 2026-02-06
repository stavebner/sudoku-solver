package sudokuRepo;

public class SudokuBoard {
    private final int[][] grid;

    public SudokuBoard(int[][] grid) {
        this.grid = copy(grid);
    }

    public int getBoardSize() {
        return grid.length;
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
    private void printBorder(int size, int box, int cellWidth) {
        int cells = size * (cellWidth + 1);
        int separators = box + 1;

        int total = cells + separators * 2;

        System.out.println("-".repeat(total));
    }
}

