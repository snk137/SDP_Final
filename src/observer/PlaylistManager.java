package observer;
import java.util.ArrayList;
import java.util.List;
public class PlaylistManager {
    private List<PlaylistObserver> observers = new ArrayList<>();

    public void addObserver(PlaylistObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (PlaylistObserver observer : observers) {
            observer.update(message);
        }
    }
}