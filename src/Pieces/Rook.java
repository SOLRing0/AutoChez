package Pieces;

import Rules.MovePattern;

public class Rook extends Piece {
    MovePattern[] rookmoves = new MovePattern[]{moves.horizontalmovement};

<<<<<<< HEAD
    public Rook(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
=======
    public Rook(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a

    }

    public MovePattern[] getRookmoves() {
        return rookmoves;
    }
}
