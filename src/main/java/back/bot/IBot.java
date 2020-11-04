package back.bot;

import back.game.IGameState;
import back.move.IMove;

public interface IBot {

    IMove doMove(IGameState state);
}
