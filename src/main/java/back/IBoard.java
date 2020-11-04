package back;

public interface IBoard {

    String AVAILABLE_SQUARE = "-1";
    String EMPTY_SQUARE = ".";

    /**
     * Clears Board
     */
    void clearBoard();

    /**
     * Gets the player ID on the given column and row
     * @param n column
     * @param m row
     * @return player ID
     */
    String getPlayer(int n, int m);

    boolean isEmpty();

    /**
     * Checks if the board is full
     * @return true if the board is full, false otherwise.
     */
    boolean isFull();

    void setBoard(String[][] board);

    void setLittleBoard(String[][] littleBoard);

    String[][] getBoard();

    String[][] getLittleBoard();

    
}
