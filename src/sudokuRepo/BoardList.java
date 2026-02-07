package sudokuRepo;

public class BoardList {
    public static class fourByFour {
        private static final int[][] fourByFour1 = {
                {0, 0, 0, 4},
                {0, 0, 0, 0},
                {2, 0, 0, 3},
                {4, 0, 1, 2}
        };
        public static final SudokuBoard fourByFourBoard1 = new SudokuBoard(fourByFour1);

        private static final int[][] fourByFour2 = {
                {1, 2, 0, 4},
                {0, 0, 2, 1},
                {0, 0, 4, 2},
                {0, 0, 0, 0}
        };
        public static final SudokuBoard fourByFourBoard2 = new SudokuBoard(fourByFour2);

    }

    public static class nineByNine {
        private static final int[][] nineByNine1 = {
                {0, 9, 0, 8, 6, 5, 2, 0, 0},
                {0, 0, 5, 0, 1, 2, 0, 6, 8},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 0, 8, 0, 5, 6},
                {0, 0, 8, 0, 0, 0, 4, 0, 0},
                {4, 5, 0, 9, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 0, 0, 0, 0, 0},
                {2, 4, 0, 1, 7, 0, 5, 0, 0},
                {0, 0, 7, 2, 8, 3, 0, 9, 0}
        };

        public static final SudokuBoard nineByNineBoard1 = new SudokuBoard(nineByNine1);


        private static final int[][] nineByNine2 = {
                {0, 0, 7, 0, 0, 1, 0, 0, 5},
                {0, 0, 5, 4, 0, 0, 3, 7, 1},
                {0, 0, 0, 0, 0, 0, 4, 8, 0},
                {0, 0, 0, 7, 9, 0, 8, 0, 2},
                {0, 9, 0, 0, 0, 0, 0, 3, 0},
                {2, 0, 3, 0, 8, 5, 0, 0, 0},
                {0, 8, 4, 0, 0, 0, 0, 0, 0},
                {7, 5, 2, 0, 0, 4, 6, 0, 0},
                {1, 0, 0, 2, 0, 0, 7, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard2 = new SudokuBoard(nineByNine2);

        private static final int[][] nineByNine3 = {
                {0, 9, 5, 0, 0, 0, 0, 0, 0},
                {0, 6, 0, 0, 9, 0, 0, 0, 0},
                {1, 8, 0, 7, 2, 3, 5, 0, 0},
                {0, 0, 0, 3, 0, 0, 0, 1, 7},
                {0, 1, 3, 0, 0, 0, 8, 4, 0},
                {6, 7, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 6, 9, 5, 8, 0, 7, 1},
                {0, 0, 0, 0, 1, 0, 0, 6, 0},
                {0, 0, 0, 0, 0, 0, 9, 5, 0}
        };
        public static final SudokuBoard nineByNineBoard3 = new SudokuBoard(nineByNine3);


        private static final int[][] nineByNine4 = {
                {0, 0, 7, 6, 3, 0, 5, 4, 0},
                {0, 0, 0, 0, 2, 1, 8, 0, 9},
                {0, 0, 0, 0, 0, 0, 3, 0, 0},
                {0, 2, 5, 0, 0, 4, 6, 0, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 4, 5, 0, 0, 9, 1, 0},
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {1, 0, 3, 7, 4, 0, 0, 0, 0},
                {0, 5, 2, 0, 1, 3, 7, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard4 = new SudokuBoard(nineByNine4);


        private static final int[][] nineByNine5 = {
                {0, 0, 3, 0, 9, 0, 0, 0, 0},
                {0, 8, 0, 4, 5, 0, 0, 0, 0},
                {9, 6, 0, 1, 0, 0, 0, 4, 8},
                {6, 0, 0, 2, 7, 0, 0, 0, 0},
                {8, 2, 0, 0, 4, 0, 0, 3, 6},
                {0, 0, 0, 0, 6, 1, 0, 0, 5},
                {7, 9, 0, 0, 0, 4, 0, 1, 2},
                {0, 0, 0, 0, 1, 5, 0, 9, 0},
                {0, 0, 0, 0, 2, 0, 8, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard5 = new SudokuBoard(nineByNine5);

        private static final int[][] nineByNine6 = {
                {0, 0, 0, 0, 0, 7, 0, 0, 5},
                {0, 0, 0, 0, 0, 1, 7, 0, 0},
                {0, 6, 9, 5, 8, 2, 0, 0, 0},
                {0, 0, 3, 7, 0, 6, 0, 5, 0},
                {6, 2, 0, 0, 5, 0, 0, 9, 7},
                {0, 5, 0, 1, 0, 9, 8, 0, 0},
                {0, 0, 0, 8, 6, 3, 5, 1, 0},
                {0, 0, 2, 9, 0, 0, 0, 0, 0},
                {1, 0, 0, 2, 0, 0, 0, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard6 = new SudokuBoard(nineByNine6);

        private static final int[][] nineByNine7 = {
                {0, 0, 0, 0, 5, 0, 6, 0, 9},
                {0, 2, 0, 0, 8, 0, 0, 5, 0},
                {0, 0, 6, 7, 0, 0, 0, 0, 0},
                {7, 0, 5, 8, 0, 2, 3, 4, 0},
                {0, 0, 2, 0, 0, 0, 9, 0, 0},
                {0, 9, 3, 5, 0, 7, 8, 0, 2},
                {0, 0, 0, 0, 0, 8, 1, 0, 0},
                {0, 7, 0, 0, 4, 0, 0, 8, 0},
                {3, 0, 8, 0, 7, 0, 0, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard7 = new SudokuBoard(nineByNine7);


        private static final int[][] nineByNine8 = {
                {0, 0, 0, 0, 0, 4, 6, 7, 8},
                {0, 0, 0, 9, 0, 0, 0, 0, 4},
                {0, 0, 7, 0, 0, 6, 1, 9, 0},
                {0, 9, 8, 7, 6, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {6, 0, 0, 0, 3, 2, 9, 1, 0},
                {0, 8, 2, 6, 0, 0, 7, 0, 0},
                {7, 0, 0, 0, 0, 3, 0, 0, 0},
                {9, 5, 6, 4, 0, 0, 0, 0, 0}
        };
        public static final SudokuBoard nineByNineBoard8 = new SudokuBoard(nineByNine8);


        private static final int[][] nineByNine9 = {
                {0, 1, 4, 7, 0, 9, 0, 2, 5},
                {0, 0, 0, 0, 0, 0, 4, 0, 0},
                {0, 9, 0, 0, 0, 4, 0, 1, 3},
                {0, 0, 5, 0, 4, 0, 0, 7, 0},
                {0, 8, 0, 0, 7, 0, 0, 5, 0},
                {0, 4, 0, 0, 5, 0, 9, 0, 0},
                {8, 5, 0, 2, 0, 0, 0, 4, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0},
                {6, 7, 0, 4, 0, 1, 5, 9, 0}
        };
        public static final SudokuBoard nineByNineBoard9 = new SudokuBoard(nineByNine9);


        private static final int[][] nineByNine10 = {
                {7, 0, 5, 0, 0, 2, 0, 0, 0},
                {0, 4, 0, 7, 0, 6, 9, 0, 0},
                {8, 0, 0, 9, 0, 0, 0, 0, 0},
                {2, 7, 0, 3, 1, 0, 0, 8, 6},
                {4, 0, 0, 0, 0, 0, 0, 2, 0},
                {5, 0, 8, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 6, 3},
                {0, 0, 0, 0, 0, 0, 0, 7, 0},
                {0, 0, 7, 0, 0, 0, 0, 9, 0}
        };
        public static final SudokuBoard nineByNineBoard10 = new SudokuBoard(nineByNine10, RuleOptions.ANTI_KNIGHT);

    }

    public static class sixteenBySixteen {
        private static final int[][] sixteenBySixteen1 = {
                {0, 0, 0, 10, 0, 4, 0, 0, 0, 0, 13, 0, 5, 0, 0, 0},
                {0, 0, 0, 8, 15, 0, 5, 1, 11, 9, 0, 7, 3, 0, 0, 0},
                {0, 4, 0, 9, 0, 14, 12, 0, 0, 16, 10, 0, 1, 0, 11, 0},
                {0, 11, 16, 0, 2, 0, 9, 0, 0, 3, 0, 14, 0, 15, 7, 0},
                {5, 0, 0, 0, 12, 16, 1, 3, 4, 11, 14, 13, 0, 0, 0, 10},
                {0, 0, 0, 12, 0, 2, 0, 15, 8, 0, 9, 0, 14, 0, 0, 0},
                {8, 1, 0, 3, 0, 0, 0, 14, 16, 0, 0, 0, 13, 0, 4, 15},
                {11, 6, 0, 0, 0, 8, 0, 0, 0, 0, 12, 0, 0, 0, 16, 9},
                {2, 13, 0, 0, 0, 11, 0, 0, 0, 0, 7, 0, 0, 0, 9, 5},
                {3, 7, 0, 16, 0, 0, 0, 12, 5, 0, 0, 0, 6, 0, 1, 14},
                {0, 0, 0, 15, 0, 7, 0, 16, 13, 0, 2, 0, 11, 0, 0, 0},
                {4, 0, 0, 0, 8, 1, 6, 5, 12, 10, 3, 16, 0, 0, 0, 13},
                {0, 3, 6, 0, 7, 0, 15, 0, 0, 14, 0, 11, 0, 16, 13, 0},
                {0, 2, 0, 11, 0, 6, 8, 0, 0, 13, 16, 0, 12, 0, 14, 0},
                {0, 0, 0, 7, 10, 0, 13, 2, 9, 12, 0, 4, 15, 0, 0, 0},
                {0, 0, 0, 13, 0, 12, 0, 0, 0, 0, 15, 0, 10, 0, 0, 0}
        };

        public static final SudokuBoard sixteenBySixteenBoard1 = new SudokuBoard(sixteenBySixteen1);

    }

}

