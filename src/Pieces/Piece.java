package Pieces;


import Rules.CommonMoves;

public class Piece {
    public boolean color;
    public boolean alive;
    String name;
    boolean available = false;
    CommonMoves moves = new CommonMoves();

    public Piece (boolean color, boolean alive, String name){
        this.color = color;
        this.alive = alive;
        this.name = name;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}


