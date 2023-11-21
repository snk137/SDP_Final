package command;
import playlist.Playlist;

public class AddSongCommand implements Command {
    private playlist.Playlist playlist;
    private song.Song song;

    public AddSongCommand(playlist.Playlist playlist, song.Song song) {
        this.playlist = playlist;
        this.song = song;
    }

    @Override
    public void execute() {
        playlist.addSong(song);
    }
}