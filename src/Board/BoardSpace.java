package Board;

public class BoardSpace {
    boolean occupied = false;
    boolean possibleMove = false;

    public BoardSpace(boolean occupation, boolean possibleMove){
        this.occupied = occupation;
        this.possibleMove = possibleMove;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setPossibleMove(boolean possibleMove) {
        this.possibleMove = possibleMove;
    }
}
