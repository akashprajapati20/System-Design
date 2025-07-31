public class SnakeAndLadderConsoleNotifier implements IObserver{
    public void update(String msg) {
        System.out.println("[NOTIFICATION] " + msg);
    }
}
