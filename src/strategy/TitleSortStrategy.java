package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import song.Song;

public class TitleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Song> playlist) {
        Collections.sort(playlist, new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                return song1.getTitle().compareTo(song2.getTitle());
            }
        });
    }
}
