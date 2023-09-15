public class Square {
    private boolean isWhite;
    private int number;

    public Square(boolean isWhite, int number) {
        this.isWhite = isWhite;
        this.number = number;
    }

    public boolean isBlack() {
        return !isWhite;
    }

    public int getNum() {
        return number;
    }
}