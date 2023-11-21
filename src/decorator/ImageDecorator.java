package decorator;

import playlist.Playlist;
import song.Song;

public class ImageDecorator implements PlaylistDecorator {
    private Playlist playlist;

    public ImageDecorator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public void customize() {
        System.out.println("Applying image customization to the playlist.");
        System.out.println("Customization: Set playlist cover image.");
        System.out.println("Customization: Apply background image to the playlist.");
    }

    @Override
    public void display() {
        System.out.println("Displaying the playlist with image customization:");
        System.out.println("Playlist Title: " + playlist.getTitle());
        System.out.println("Customized Display: Show playlist with cover image and background.");
    }

    @Override
    public void play() {
        System.out.println("Playing the playlist with image customization.");
        System.out.println("Play each song with the playlist cover image.");
    }

    public void shareWithImage() {
        System.out.println("Sharing the playlist with image customization.");
        System.out.println("Share the playlist with cover image on social media platforms.");
    }


    public void addSongWithImage(Song song) {
        System.out.println("Adding a song with image customization to the playlist.");
        playlist.addSong(song);
        System.out.println("Customization: Highlight the newly added song with cover image.");
    }
}
