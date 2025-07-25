public class ConsoleNotifier implements IObserver{

        public void update(String msg) {
            System.out.println("[Notification] " + msg);
        }

}
