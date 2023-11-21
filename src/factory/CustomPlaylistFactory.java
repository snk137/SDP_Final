package factory;

import playlist.Playlist;
import playlist.CustomPlaylist;

public class CustomPlaylistFactory implements PlaylistFactory {
    @Override
    public Playlist createPlaylist() {
        CustomPlaylist customPlaylist = new CustomPlaylist();

        customPlaylist.customizePlaylist("Grid View", "Advanced Features");

        customPlaylist.setTheme("Cool Vibes");

        System.out.println("Custom playlist created with theme: " + customPlaylist.getTheme());

        return customPlaylist;
    }
}
