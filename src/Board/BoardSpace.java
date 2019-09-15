package Board;

public class BoardSpace {
    boolean occupied = false;
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
    }
}
