package back.game;

import back.bot.IBot;

public class Gamer {

    private final IGameState currentState;
    private int firstToPlay = 0;
    private int currentPlayer = firstToPlay;
    public final String P_0_MARKER = "0";
    public final String P_1_MARKER = "1";
    private IBot bot = null;


    public Gamer(IGameState currentState) {
        this.currentState = currentState;
        this.bot = bot;
    }

    public void resetGame() {
        currentState.getBoard().clearBoard();
        firstToPlay = (firstToPlay + 1) % 2;
        currentPlayer = firstToPlay;
    }




}
