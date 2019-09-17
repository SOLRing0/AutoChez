package Pieces;

import Rules.MovePattern;

public class Pawn extends Piece {

    MovePattern[] pawnmoves = new MovePattern[]
            {new MovePattern(2,0, false),
                    new MovePattern(1, 1, true),
                    new MovePattern(-1, 1, true)};



    public Pawn(boolean color, boolean alive, String name) {
        super(color, alive, name);
    }

    public MovePattern[] getPawnmoves() {
        return pawnmoves;
    }

}
