package Pieces;

import Rules.MovePattern;

public class King extends Piece {
    MovePattern[] kingmoves = new MovePattern[]{new MovePattern(1, 0, true), new MovePattern(0, 1, true),new MovePattern(1, 1, true), new MovePattern(-1, 1, true)};

    public King(boolean color, boolean alive, String name) {
        super(color, alive, name);
    }

    public MovePattern[] getKingmoves() {
        return kingmoves;
    }
}
