package Pieces;

import Rules.MovePattern;

public class Rook extends Piece {
    MovePattern[] rookmoves = new MovePattern[]{moves.horizontalmovement};

    public Rook(boolean color, boolean alive, String name) {
        super(color, alive, name);

    }

    public MovePattern[] getRookmoves() {
        return rookmoves;
    }
}
