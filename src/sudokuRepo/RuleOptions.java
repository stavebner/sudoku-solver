package sudokuRepo;

import java.util.stream.IntStream;

public enum RuleOptions {
    BASIC_RULES((int[][] mat, int row, int col, int num) -> {
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
    }), ANTI_KNIGHT((int[][] mat, int row, int col, int num) -> {
        int[] rowDistance = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] colDistance = {1, -1, 1, -1, 2, -2, 2, -2};

        for (int i = 0; i < rowDistance.length; i++) {
            int checkRow = row + rowDistance[i];
            int checkCol = col + colDistance[i];

            if (isInBounds(mat.length, checkRow, checkCol) && mat[checkRow][checkCol] == num) {
                return false;
            }
        }

        return true;
    });

    private Rule rule;

    RuleOptions(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return rule;
    }

    private static boolean isInBounds(int boardSize, int row, int col) {
        return row > -1 && row < boardSize && col > -1 && col < boardSize;
    }
}
