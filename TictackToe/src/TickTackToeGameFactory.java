
public class TickTackToeGameFactory {
    public static TicTacToeGame createGame(GameType gt, int boardSize) {
        if(GameType.STANDARD == gt) {
            return new TicTacToeGame(boardSize);
        }
        return null;
    }
}
