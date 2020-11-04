package back;

public class Board implements IBoard {

    private String[][] theBoard;
    private String[][] littleBoard;

    public Board() {
        theBoard = new String[9][9];
        littleBoard = new String[3][3];
        clearBoard();
    }

    @Override
    public void clearBoard() {
        clearLittleBoards();
        clearTheBoard();
    }

    private void clearLittleBoards() {
        for (int i = 0; i < theBoard.length; i++) {
            for (int j = 0; j < theBoard[i].length; j++) {
                theBoard[i][j] = EMPTY_SQUARE;
            }
        }
    }

    private void clearTheBoard() {
        for (int i = 0; i < littleBoard.length; i++) {
            for (int j = 0; j < littleBoard[i].length; j++) {
                littleBoard[i][j] = EMPTY_SQUARE;
            }
        }
    }

    @Override
    public String getPlayer(int n, int m) {
        return theBoard[n][m];
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < theBoard.length; i++) {
            for (int j = 0; j < theBoard[i].length; j++) {
                return theBoard[i][j].equals(EMPTY_SQUARE);
            }
        }
        return false;
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < theBoard.length; i++) {
            for (int j = 0; j < theBoard[i].length; j++) {
                if (littleBoard[i][j].equals(EMPTY_SQUARE) || littleBoard[i][j].equals(EMPTY_SQUARE)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void setBoard(String[][] board) {
        this.theBoard = theBoard;
    }

    @Override
    public void setLittleBoard(String[][] littleBoard) {
        this.littleBoard = littleBoard;
    }

    @Override
    public String[][] getBoard() {
        return theBoard;
    }

    @Override
    public String[][] getLittleBoard() {
        return littleBoard;
    }
}
