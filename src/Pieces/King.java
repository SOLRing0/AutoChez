package Pieces;

import Rules.MovePattern;

public class King extends Piece {
<<<<<<< HEAD
MovePattern[] kingmoves = new MovePattern[]{new MovePattern(1, 0, true), new MovePattern(0, 1, true),new MovePattern(1, 1, true), new MovePattern(-1, 1, true)};

    public King(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
=======
    MovePattern[] kingmoves = new MovePattern[]{new MovePattern(1, 0, true), new MovePattern(0, 1, true),new MovePattern(1, 1, true), new MovePattern(-1, 1, true)};

    public King(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a
    }

    public MovePattern[] getKingmoves() {
        return kingmoves;
    }
}
