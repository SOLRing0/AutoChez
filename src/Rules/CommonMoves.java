package Rules;

public class CommonMoves {
    public MovePattern horizontalmovement = new MovePattern(7, 0, true);
    public MovePattern verticalmovement = new MovePattern(0, 7, true);
    public MovePattern diagonalrightmovement = new MovePattern(7, 7, true);
    public MovePattern diagonalleftmovement = new MovePattern(-7,7, true);


    public MovePattern getDiagonalleftmovement() {
        return diagonalleftmovement;
    }

    public MovePattern getDiagonalrightmovement() {
        return diagonalrightmovement;
    }

    public MovePattern getHorizontalmovement() {
        return horizontalmovement;
    }

    public MovePattern getVerticalmovement() {
        return verticalmovement;
    }
}
