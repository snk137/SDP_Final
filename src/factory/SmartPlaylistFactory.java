package factory;

import playlist.Playlist;
import playlist.SmartPlaylist;

public class SmartPlaylistFactory implements PlaylistFactory {
    @Override
    public Playlist createPlaylist() {
        return new SmartPlaylist();
    }
}
