package Pieces;

import Rules.MovePattern;


public class Bishop extends Piece {
    MovePattern[] bishopmoves = new MovePattern[]{moves.diagonalleftmovement, moves.diagonalrightmovement};

    public Bishop(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
    }

    public MovePattern[] getBishopmoves() {
        return bishopmoves;
    }
}
