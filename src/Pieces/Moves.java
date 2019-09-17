package Pieces;

import Rules.MovePattern;
import Rules.CommonMoves;

public class Moves {
    public static MovePattern[] kingmoves = new MovePattern[]{
            new MovePattern(1, 0, true),
            new MovePattern(0, 1, true),
            new MovePattern(1, 1, true),
            new MovePattern(-1, 1, true)};
    public static MovePattern[] knightmoves = new MovePattern[]{
            new MovePattern(2, 1, true),
            new MovePattern(1, 2, true),
            new MovePattern(2, -1, true),
            new MovePattern(-2, 1, true)};
    public static MovePattern[] pawnmoves = new MovePattern[]{
            new MovePattern(2, 0, false),
            new MovePattern(1, 1, true),
            new MovePattern(-1, 1, true)};
    public static MovePattern[] queenmoves = new MovePattern[]{
            CommonMoves.verticalmovement,
            CommonMoves.horizontalmovement,
            CommonMoves.diagonalrightmovement,
            CommonMoves.diagonalleftmovement};
    public static MovePattern[] rookmoves = new MovePattern[]{
            CommonMoves.horizontalmovement};
    public static MovePattern[] bishopmoves = new MovePattern[]{
            CommonMoves.diagonalleftmovement, CommonMoves.diagonalrightmovement};

}
