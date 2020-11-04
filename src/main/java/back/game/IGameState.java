package back.game;

import back.board.IBoard;

public interface IGameState {

    IBoard getBoard();

    int getMoves();
    void setMove();

    int getRounds();
    void setRound();
}
