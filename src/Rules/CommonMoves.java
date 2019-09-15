package Rules;

public class CommonMoves {
    public static MovePattern horizontalmovement = new MovePattern(7, 0, true);
    public static MovePattern verticalmovement = new MovePattern(0, 7, true);
    public static MovePattern diagonalrightmovement = new MovePattern(7, 7, true);
    public static MovePattern diagonalleftmovement = new MovePattern(-7,7, true);


    public static MovePattern getDiagonalleftmovement() {
        return diagonalleftmovement;
    }

    public static MovePattern getDiagonalrightmovement() {
        return diagonalrightmovement;
    }

    public static MovePattern getHorizontalmovement() {
        return horizontalmovement;
    }

    public static MovePattern getVerticalmovement() {
        return verticalmovement;
    }
}
