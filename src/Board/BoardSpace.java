package Board;

public class BoardSpace {
    boolean occupied = false;
<<<<<<< HEAD
    boolean available = false;
    boolean possibleMove = false;

    public BoardSpace(boolean occupation, boolean availability, boolean possibleMove){
        this.occupied = occupation;
        this.available = availability;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setAvailable(boolean available) {
        this.available = available;
=======
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
>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a
    }
}
