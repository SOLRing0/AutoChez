package Pieces;

import Rules.MovePattern;

public class Queen extends Piece {

    MovePattern[] queenmoves = new MovePattern[]{
            moves.verticalmovement,
            moves.horizontalmovement,
            moves.diagonalrightmovement,
            moves.diagonalleftmovement};


    public Queen(boolean color, boolean alive, String name) {
        super(color, alive, name);


    }

    public MovePattern[] getQueenmoves() {
        return queenmoves;
    }
}
