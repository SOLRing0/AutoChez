package Rules;

import Board.BoardSpace;
import Pieces.Piece;

public class checkOccupied {
    public static BoardSpace[][] checkOccupied(BoardSpace[][] currentBoard, Piece[][] currentPieces){
        for (int x = 0; x <= 7; ++x) {
            for (int y = 0; y <=7; ++y) {
                if (currentPieces[x][y] != null){
                    currentBoard[x][y].setOccupied(true);
                }else{
                    currentBoard[x][y].setOccupied(false);
                }
            }

        }
        return currentBoard;
    }
}
