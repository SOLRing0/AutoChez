package Board;

public class BoardSpace {
    boolean occupied = false;
    boolean possibleMove = false;

    public BoardSpace(){
        this.occupied = occupied;
        this.possibleMove = possibleMove;
    }

    public void setOccupied(boolean state) {
        this.occupied = state;
    }

    public void setPossibleMove(boolean state) {
        this.possibleMove = state;
    }
}
