package strategy;
import java.util.List;
import song.Song;

interface SortingStrategy {
    void sort(List<Song> playlist);
}