public class TictacToePlayer {
    private int playerId;
    private String name;
    private Symbol symbol;
    private int score;

    public TictacToePlayer(int playerId, Symbol symbol, String name) {
        this.playerId = playerId;
        this.symbol = symbol;
        this.name = name;
        score=0;
    }

    public void incrementScore() {
        score++;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
