package Pieces;

import Rules.MovePattern;

public class Knight extends Piece {

    MovePattern[] knightmoves = new MovePattern[]{new MovePattern(2, 1, true), new MovePattern(1, 2, true), new MovePattern(2, -1, true), new MovePattern(-2, 1, true)};

<<<<<<< HEAD
    public Knight(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
=======
    public Knight(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a
    }

    public MovePattern[] getKnightmoves() {
        return knightmoves;
    }
}
