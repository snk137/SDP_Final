package song;

public class SongDetails {
    private String artist;
    private String album;
    private String releaseDate;

    public SongDetails(String artist, String album, String releaseDate) {
        this.artist = artist;
        this.album = album;
        this.releaseDate = releaseDate;
    }
    public String getArtist() {
        return artist;
    }


}