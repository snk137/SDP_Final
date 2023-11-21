package playlist;

import song.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String title;
    private List<Song> songs = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public final void addSong(Song song) {
        if (song != null) {
            if (!songs.contains(song)) {
                songs.add(song);
                System.out.println("Song added to the playlist: " + song.getTitle());
            } else {
                System.out.println("Song already exists in the playlist: " + song.getTitle());
            }
        } else {
            System.out.println("Cannot add null song to the playlist.");
        }
    }

}
