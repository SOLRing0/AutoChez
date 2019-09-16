package Pieces;

import Rules.MovePattern;

public class Pawn extends Piece {

    MovePattern[] pawnmoves = new MovePattern[]{new MovePattern(2,0, false), new MovePattern(1, 1, true), new MovePattern(-1, 1, true)};
<<<<<<< HEAD
        public Pawn(boolean color, boolean alive, int xpos, int ypos) {
            super(color, alive, xpos, ypos);
=======
    public Pawn(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a

    }

    public MovePattern[] getPawnmoves() {
        return pawnmoves;
    }

}
