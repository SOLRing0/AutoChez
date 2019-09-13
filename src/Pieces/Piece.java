package Pieces;


import Rules.CommonMoves;

public class Piece {
    private boolean color;
    private int xpos;
    private int ypos;
    private boolean alive;
    boolean available = false;
    CommonMoves moves = new CommonMoves();

    public Piece (boolean color, boolean alive, int xpos, int ypos){
        this.color = color;
        this.alive = alive;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }
}


