package sudokuRepo;

@FunctionalInterface
public interface Rule {
    boolean isSafe(int[][] mat, int row, int col, int num);
}
