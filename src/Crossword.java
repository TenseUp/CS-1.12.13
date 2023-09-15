public class Crossword {

    private Square[][] puzzle;

    public Crossword(boolean[][] black) {
        int n = black.length;
        int m = black[0].length;

        this.puzzle = new Square[n][m];

        int label = 1;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                boolean toBeLabeled = toBeLabeled(x, y, black);

                int num = black[x][y] || !toBeLabeled ? 0 : label++;

                this.puzzle[x][y] = new Square(!black[x][y], num);
            }
        }
    }

    private boolean toBeLabeled(int x, int y, boolean[][] black) {
        if (black[x][y]) return false;

        if (y == 0 || black[x][y-1]) return true;

        if (x == 0 || black[x-1][y]) return true;

        return false;
    }

    public Square[][] getPuzzle() {
        return puzzle;
    }

}