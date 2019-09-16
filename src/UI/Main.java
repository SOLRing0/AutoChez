package UI;

import Board.BoardSpace;
import Board.newBoard;
import Pieces.Piece;
import Player.Player;
import Board.newPieces;
import Rules.checkOccupied;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(true);
        Player player2 = new Player(false);
        newPieces currentGame = new newPieces();
        Piece [][] currentPieces = currentGame.newGame();
        newBoard startBoard = new newBoard();
        BoardSpace[][] currentBoard = startBoard.newBoard();
        currentBoard =  checkOccupied.checkOccupied(currentBoard, currentPieces);




    
    }
}
