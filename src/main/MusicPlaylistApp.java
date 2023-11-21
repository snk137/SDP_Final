package main;

import java.util.ArrayList;
import factory.CustomPlaylistFactory;
import factory.SmartPlaylistFactory;
import singleton.PlaylistManagerSingleton;


public class MusicPlaylistApp {
    public static void main(String[] args) {
        // Create observer and observed objects
        observer.PlaylistManager playlistManager = new observer.PlaylistManager();
        observer.User user = new observer.User();
        playlistManager.addObserver(user);

        // adding a song and notifying the observer
        playlistManager.notifyObservers("New song added");

        // Creating a Singleton Instance
        PlaylistManagerSingleton singleton = PlaylistManagerSingleton.getInstance();

        // Sorting Playlists Using strategy
        strategy.PlaylistContext context = new strategy.PlaylistContext();
        context.setSortingStrategy(new strategy.TitleSortStrategy());
        context.sortPlaylist(new ArrayList<>());

        // Undo/Redo using Command
        command.UndoRedoManager undoRedoManager = new command.UndoRedoManager();
        playlist.Playlist myPlaylist = new playlist.Playlist();
        command.AddSongCommand addCommand = new command.AddSongCommand(myPlaylist, new song.Song("Song Title", new song.SongDetails("Artist", "Album", "2023-01-01")));
        undoRedoManager.executeCommand(addCommand);
        undoRedoManager.undo();

        // Creating Smart Playlists
        factory.PlaylistFactory smartPlaylistFactory = new SmartPlaylistFactory();
        playlist.Playlist smartPlaylist = smartPlaylistFactory.createPlaylist();

        // Creating customized playlists
        factory.PlaylistFactory customPlaylistFactory = new CustomPlaylistFactory();
        playlist.Playlist customPlaylist = customPlaylistFactory.createPlaylist();


        // Adding a theme to a playlist using decorator
        decorator.PlaylistDecorator themedPlaylist = new decorator.ThemeDecorator(myPlaylist);
        themedPlaylist.customize();

        // Creating different types of playlists using factory
        smartPlaylistFactory = new SmartPlaylistFactory();
        smartPlaylist = smartPlaylistFactory.createPlaylist();

        customPlaylistFactory = new CustomPlaylistFactory();
        customPlaylist = customPlaylistFactory.createPlaylist();
    }
}