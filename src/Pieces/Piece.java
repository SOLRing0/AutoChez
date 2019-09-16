package Pieces;


import Rules.CommonMoves;

public class Piece {
<<<<<<< HEAD
    private boolean color;
    private int xpos;
    private int ypos;
    private boolean alive;
    CommonMoves moves = new CommonMoves();

    public Piece (boolean color, boolean alive, int xpos, int ypos){
        this.color = color;
        this.alive = alive;
        this.xpos = xpos;
        this.ypos = ypos;
    }
}

=======
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


>>>>>>> f749378794b2596524051ffc1d990bbed9b5ee2a
