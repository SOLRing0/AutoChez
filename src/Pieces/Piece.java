package Pieces;


import Rules.CommonMoves;

public class Piece {
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

