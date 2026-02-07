package sudokuRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static sudokuRepo.BoardList.fourByFour.*;
import static sudokuRepo.BoardList.nineByNine.*;
import static sudokuRepo.BoardList.sixteenBySixteen.*;


public class SudokuRepo {
    private List<SudokuBoard> boards;

    public SudokuRepo() {
        initBoards();
    }

    public SudokuBoard getRandomBoard() {
        return boards.get(ThreadLocalRandom.current().nextInt(boards.size()));
    }

    public SudokuBoard getRandomBoard(int boardSize) {
        List<SudokuBoard> filteredList = boards.stream().filter(board -> board.getBoardSize() == boardSize).toList();

        return filteredList.get(ThreadLocalRandom.current().nextInt(boards.size()));
    }

    public SudokuBoard getRandomBoard(RuleOptions... rules) {
        Set<RuleOptions> wanted = Set.copyOf(List.of(rules));

        List<SudokuBoard> filtered =
                boards.stream()
                        .filter(b -> b.getRules().equals(wanted))
                        .toList();

        return filtered.get(ThreadLocalRandom.current().nextInt(filtered.size()));
    }

    private void initBoards() {
        boards = new ArrayList<>();

        boards.add(fourByFourBoard1);
        boards.add(fourByFourBoard2);

        boards.add(nineByNineBoard1);
        boards.add(nineByNineBoard2);
        boards.add(nineByNineBoard3);
        boards.add(nineByNineBoard4);
        boards.add(nineByNineBoard5);
        boards.add(nineByNineBoard6);
        boards.add(nineByNineBoard7);
        boards.add(nineByNineBoard8);
        boards.add(nineByNineBoard9);
        boards.add(nineByNineBoard10);

        boards.add(sixteenBySixteenBoard1);
    }
}
