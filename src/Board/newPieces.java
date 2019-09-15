package Board;

import Pieces.*;

public class newPieces {
    Pawn P1W = new Pawn(true, true, "P1W");
    Pawn P2W = new Pawn(true, true, "P2W");
    Pawn P3W = new Pawn(true, true, "P3W");
    Pawn P4W = new Pawn(true, true, "P4W");
    Pawn P5W = new Pawn(true, true, "P5W");
    Pawn P6W = new Pawn(true, true, "P6W");
    Pawn P7W = new Pawn(true, true, "P7W");
    Pawn P8W = new Pawn(true, true, "P8W");
    Pawn P1B = new Pawn(false, true, "P1B");
    Pawn P2B = new Pawn(false, true, "P2B");
    Pawn P3B = new Pawn(false, true, "P3B");
    Pawn P4B = new Pawn(false, true, "P4B");
    Pawn P5B = new Pawn(false, true, "P5B");
    Pawn P6B = new Pawn(false, true, "P6B");
    Pawn P7B = new Pawn(false, true, "P7B");
    Pawn P8B = new Pawn(false, true, "P8B");
    Rook R1W = new Rook(true,true, "R1W");
    Rook R2W = new Rook(true,true, "R2W");
    Rook R1B = new Rook(false,true, "R1B");
    Rook R2B = new Rook(false,true, "R1B");
    Bishop B1W = new Bishop(true, true, "B1W");
    Bishop B2W = new Bishop(true, true, "B2W");
    Bishop B1B = new Bishop(true, true, "B1B");
    Bishop B2B = new Bishop(true, true, "B2B");
    Knight KN1W = new Knight(true, true, "KN1W");
    Knight KN2W = new Knight(true, true, "KN2W");
    Knight KN1B = new Knight(false, true, "KN1B");
    Knight KN2B = new Knight(false, true, "KN2B");
    Queen QW = new Queen(true, true, "QW");
    Queen QB = new Queen(false, true, "QB");
    King KW = new King(true, true, "KW");
    King KB = new King(false, true, "KB");

    public Piece[][] newGame(){

        Piece[] whitePawns = new Piece[]{P1W, P2W, P3W, P4W, P5W, P6W, P7W, P8W};
        Piece[] blackPawns = new Piece[]{P1B, P2B, P3B, P4B, P5B, P6B, P7B, P8B};
        Piece[][] pieceArray = new Piece[8][8];

        for (int i = 0; i < 8; i++) {
            pieceArray[6][i] = whitePawns[i];
            pieceArray[1][i] = blackPawns[i];
        }

        pieceArray[7][0] = R1W;
        pieceArray[7][7] = R2W;
        pieceArray[0][0] = R1B;
        pieceArray[0][7] = R2B;
        pieceArray[7][1] = KN1W;
        pieceArray[7][6] = KN2W;
        pieceArray[0][1] = KN1B;
        pieceArray[0][6] = KN2B;
        pieceArray[7][2] = B1W;
        pieceArray[7][5] = B2W;
        pieceArray[0][2] = B1B;
        pieceArray[0][5] = B2B;
        pieceArray[7][3] = QW;
        pieceArray[7][4] = KW;
        pieceArray[0][3] = QB;
        pieceArray[0][4] = KB;
        return pieceArray;







    }
}
