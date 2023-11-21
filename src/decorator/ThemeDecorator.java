package decorator;

import playlist.Playlist;
import song.Song;

public class ThemeDecorator implements PlaylistDecorator {
    private Playlist playlist;

    public ThemeDecorator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public void customize() {
        System.out.println("Applying theme customization to the playlist.");
        System.out.println("Customization: Change playlist color to dark mode.");
        System.out.println("Customization: Apply cool background image.");
    }

    @Override
    public void display() {
        System.out.println("Displaying the playlist with theme customization:");
        System.out.println("Playlist Title: " + playlist.getTitle());
        System.out.println("Number of Songs: " + playlist.getSongs().size());
        System.out.println("Customized Display: Show playlist in a visually appealing way.");
    }

    @Override
    public void play() {
        System.out.println("Playing the playlist with theme customization.");
        System.out.println("Play each song with a smooth transition.");
    }

    public void share() {
        System.out.println("Sharing the playlist with theme customization.");
        System.out.println("Share the playlist on social media platforms.");
    }


    public void addSongWithTheme(Song song) {
        System.out.println("Adding a song with theme customization to the playlist.");
        playlist.addSong(song);
        System.out.println("Customization: Highlight the newly added song in the playlist.");
    }
}
