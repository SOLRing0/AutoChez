package Pieces;

import Rules.MovePattern;
<<<<<<< HEAD
import Rules.CommonMoves;

public class Bishop extends Piece {
  MovePattern[] bishopmoves = new MovePattern[]{moves.diagonalleftmovement, moves.diagonalrightmovement};

    public Bishop(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
=======


public class Bishop extends Piece {
    MovePattern[] bishopmoves = new MovePattern[]{moves.diagonalleftmovement, moves.diagonalrightmovement};

    public Bishop(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a
    }

    public MovePattern[] getBishopmoves() {
        return bishopmoves;
    }
}
