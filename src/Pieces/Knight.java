package Pieces;

import Rules.MovePattern;

public class Knight extends Piece {

    MovePattern[] knightmoves = new MovePattern[]{
            new MovePattern(2, 1, true),
            new MovePattern(1, 2, true),
            new MovePattern(2, -1, true),
            new MovePattern(-2, 1, true)};



    public Knight(boolean color, boolean alive, String name) {
        super(color, alive, name);

    }

    public MovePattern[] getKnightmoves() {
        return knightmoves;
    }
}
