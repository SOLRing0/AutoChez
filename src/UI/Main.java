package UI;

import Pieces.Piece;
import Player.Player;
import Board.newPieces;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(true);
        Player player2 = new Player(false);
        Piece[][] gamePieces = newPieces.newGame();
        System.out.println(gamePieces);


    
    }
}
