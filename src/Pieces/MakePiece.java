package Pieces;

import Rules.MovePattern;

public class MakePiece {
    public Piece makePiece(Boolean white, Boolean alive, MovePattern[] moves, String name){
        Piece piece = new Piece(white, alive, moves, name);
    }
}
