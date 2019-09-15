package Pieces;

import Rules.MovePattern;

public class Rook extends Piece {
    MovePattern[] rookmoves = new MovePattern[]{moves.horizontalmovement};

    public Rook(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);

    }

    public MovePattern[] getRookmoves() {
        return rookmoves;
    }
}
