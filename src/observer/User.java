package observer;

public class User implements PlaylistObserver {
    @Override
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}