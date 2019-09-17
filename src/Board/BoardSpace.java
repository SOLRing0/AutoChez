package Board;

public class BoardSpace {
    boolean occupied = false;
    boolean possibleMove = false;

    public BoardSpace(){
    }

    public void setOccupied(boolean state) {
        this.occupied = state;
    }

    public void setPossibleMove(boolean state) {
        this.possibleMove = state;

    }
}
