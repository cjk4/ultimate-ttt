package back.game;

import back.board.Board;
import back.board.IBoard;

public class GameState implements IGameState{

    IBoard board;
    int moves;
    int rounds;

    public GameState() {
        board = new Board();
        moves = 0;
        rounds = 0;
    }

    public IBoard getBoard() {
        return board;
    }

    public int getMoves() {
        return moves;
    }

    public void setMove() {
        this.moves = moves;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRound() {
        this.rounds = rounds;
    }



}
