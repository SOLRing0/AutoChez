package Pieces;


import Rules.CommonMoves;
import Rules.MovePattern;

import java.awt.image.BufferedImage;

public class Piece {

    public boolean white;
    public boolean alive =  false;
    public String name;
    public boolean available = false;
    public BufferedImage pieceIMG = null;

    CommonMoves moves = new CommonMoves();

    public Piece (boolean white, MovePattern[] moves, String name){
        this.white = white;
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



