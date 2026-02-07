import sudokuRepo.RuleOptions;
import sudokuRepo.SudokuBoard;
import sudokuRepo.SudokuRepo;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        SudokuRepo sudokuRepo = new SudokuRepo();
        SudokuBoard mat = sudokuRepo.getRandomBoard(RuleOptions.BASIC_RULES);

        mat.printSudoku();
        mat.getRules().forEach(ruleOptions -> System.out.print(ruleOptions.name() + ", "));
        System.out.println("\b\b");
        System.out.println("Activating solver");

        SudokuBoard solvedBoard = mat.sudokuSolver();
        boolean solved = solvedBoard.isSolvedSudokuBoard();

        solvedBoard.printSudoku();

        if (solved) {
            System.out.println("Sudoku solved successfully");
        } else {
            System.out.println("Sudoku could not be solved");
        }
    }
}