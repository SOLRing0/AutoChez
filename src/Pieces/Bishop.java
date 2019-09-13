package Pieces;

import Rules.MovePattern;


public class Bishop extends Piece {
    MovePattern[] bishopmoves = new MovePattern[]{moves.diagonalleftmovement, moves.diagonalrightmovement};

    public Bishop(boolean color, boolean alive, String name) {
        super(color, alive, name);
    }

    public MovePattern[] getBishopmoves() {
        return bishopmoves;
    }
}
