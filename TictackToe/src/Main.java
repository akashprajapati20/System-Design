import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TIC TAC TOE GAME ===");

        // Create game with custom board size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter board size (e.g., 3 for 3x3): ");
        int boardSize = scanner.nextInt();

        TicTacToeGame game = TickTackToeGameFactory.createGame(GameType.STANDARD, boardSize);

        // Add observer
        IObserver notifier = new ConsoleNotifier();
        game.addObserver(notifier);

        // Create players with custom symbols
        TictacToePlayer player1 = new TictacToePlayer(1, new Symbol('X'), "Aditya");
        TictacToePlayer player2 = new TictacToePlayer(2, new Symbol('O'), "Harshita");

        game.addPlayer(player1);
        game.addPlayer(player2);

        // Play the game
        game.play();

        scanner.close();

    }
}