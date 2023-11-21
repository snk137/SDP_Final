package song;

public class Song {
    private String title;
    private SongDetails details;

    public Song(String title, SongDetails details) {
        this.title = title;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public SongDetails getDetails() {
        return details;
    }


}
