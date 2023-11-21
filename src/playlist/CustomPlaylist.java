package playlist;

import song.Song;

public class CustomPlaylist extends Playlist {
    private String displayMode;
    private String customFeature;
    private String theme;

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    public String getCustomFeature() {
        return customFeature;
    }

    public void setCustomFeature(String customFeature) {
        this.customFeature = customFeature;
    }
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void applyCustomSorting() {
        getSongs().sort((song1, song2) -> song1.getDetails().getArtist().compareTo(song2.getDetails().getArtist()));
        System.out.println("Custom sorting applied to the playlist.");
    }

    public void customizePlaylist(String displayMode, String customFeature) {
        this.displayMode = displayMode;
        this.customFeature = customFeature;
        System.out.println("Playlist customized with Display Mode: " + displayMode + ", Custom Feature: " + customFeature);
    }
}
