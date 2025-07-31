// Strategy Pattern for game rules
public interface SnakeAndLadderRules {
    boolean isValidMove(int currentPos, int diceValue, int boardSize);
    int calculateNewPosition(int currentPos, int diceValue, Board board);
    boolean checkWinCondition(int position, int boardSize);
}
