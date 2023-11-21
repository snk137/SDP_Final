package singleton;

public class PlaylistManagerSingleton {
    private static PlaylistManagerSingleton instance;

    private PlaylistManagerSingleton() {
    }

    public static PlaylistManagerSingleton getInstance() {
        if (instance == null) {
            instance = new PlaylistManagerSingleton();
        }
        return instance;
    }
}