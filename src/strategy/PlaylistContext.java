package strategy;
import java.util.List;
import song.Song;
public class PlaylistContext {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortPlaylist(List<Song> playlist) {
        sortingStrategy.sort(playlist);
    }
}