package org.example;

public class PokerGame {
    public static void main(String[] args) {
        Dealer dealer = new GoodDealer();
        Board board = dealer.dealCardsToPlayers();
        System.out.println(board.toString());
        board = dealer.dealFlop(board);
      /*  board = dealer.dealTurn(board);
        board = dealer.dealRiver(board);
        PokerResult pokerResult = dealer.decideWinner(board);*/
    }
}
