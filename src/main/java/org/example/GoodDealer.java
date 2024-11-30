package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GoodDealer implements Dealer {
    private List<String> linkedList = new LinkedList<>(
            List.of("2C", "2D", "2H", "2S", "3C", "3D", "3H", "3S", "4C", "4D", "4H", "4S", "5C",
                    "5D", "5H", "5S", "6C", "6D", "6H", "6S", "7C", "7D", "7H", "7S", "8C", "8D",
                    "8H", "8S", "9C", "9D", "9H", "9S", "10C", "10D", "10H", "10S", "JC", "JD",
                    "JH", "JS", "QC", "QD", "QH", "QS", "KC", "KD", "KH", "KS", "AC", "AD", "AH", "AS")
    );
    @Override
    public Board dealCardsToPlayers() {

        Random random = new Random();
        String firstPlayer = linkedList.remove(random.nextInt(linkedList.size())) +
                linkedList.remove(random.nextInt(linkedList.size()));

        String secondPlayer = linkedList.remove(random.nextInt(linkedList.size())) +
                linkedList.remove(random.nextInt(linkedList.size()));

        return new Board(firstPlayer,
                         secondPlayer,
                     null,
                     null,
                     null);
    }

    @Override
    public Board dealFlop(Board board) {
        Random random = new Random();
        String flop = linkedList.remove(random.nextInt(linkedList.size())) +
                linkedList.remove(random.nextInt(linkedList.size())) +
                linkedList.remove(random.nextInt(linkedList.size()));
        return new Board(board.getPlayerOne(),
                         board.getPlayerTwo(),
                         flop,
                    null,
                    null);
    }

    @Override
    public Board dealTurn(Board board) {
        Random random = new Random();
        String turn = linkedList.remove(random.nextInt(linkedList.size()));
        return new Board(board.getPlayerOne(),
                         board.getPlayerTwo(),
                         board.getFlop(),
                         turn,
                    null);
    }

    @Override
    public Board dealRiver(Board board) {
        Random random = new Random();
        String river = linkedList.remove(random.nextInt(linkedList.size()));

        return new Board(board.getPlayerOne(),
                         board.getPlayerTwo(),
                         board.getFlop(),
                         board.getTurn(),
                         river);

    }

    @Override
    public PokerResult decideWinner(Board board) throws InvalidPokerBoardException {
        return null;
    }
}
