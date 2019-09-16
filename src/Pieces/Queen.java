package Pieces;

import Rules.MovePattern;

public class Queen extends Piece {

    MovePattern[] queenmoves = new MovePattern[]{moves.verticalmovement,moves.horizontalmovement,moves.diagonalrightmovement,moves.diagonalleftmovement};

<<<<<<< HEAD
    public Queen(boolean color, boolean alive, int xpos, int ypos) {
        super(color, alive, xpos, ypos);
=======
    public Queen(boolean color, boolean alive, String name) {
        super(color, alive, name);
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a

    }

    public MovePattern[] getQueenmoves() {
        return queenmoves;
    }
}
