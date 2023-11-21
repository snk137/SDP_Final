# SDP_Final
  
 
 



 
Music Playlist Management System

“Software Design Patterns” course
 




 
Group: SE-2224

Team members: Nurgaziz Serik

Teaching Assistant: Arailym Bakenova 





 
Astana, 2023

## Project Overview
### Information about the Project:
 The project is a music playlist application designed to manage and customize playlists with various features.  <br />
Developed using Java, the application employs multiple design patterns to enhance modularity, flexibility, and maintainability.  <br />

### Idea of the Project:
The idea is to create a robust music playlist application that allows users to customize playlists, apply themes, and utilize various design patterns to achieve a scalable and extensible architecture. <br />

### Purpose of the Work:
The purpose is to showcase the practical implementation of different design patterns in a real-world software application. <br />
Demonstrate how these patterns contribute to code organization, reusability, and scalability. <br />

### Objectives of the Work:
Implement features like adding songs, customizing playlists, applying themes, and sorting strategies. <br />
Utilize design patterns such as Command, Decorator, Factory, Observer, Singleton, and Strategy. <br />
Create a modular and extensible codebase for easy maintenance and future enhancements. <br />















## UML Diagram
 ![Screenshot](src.png)

https://github.com/snk137/SDP_Final















## Main body
### Features and Design Patterns:
### Observer Pattern: <br />
Used in the «PlaylistManager» to notify users (observers) about changes in the playlist, e.g., when a new song is added. <br />

### Singleton Pattern: <br />
Applied in «PlaylistManagerSingleton» to ensure a single instance of the playlist manager is created. <br />

### Command Pattern: <br />
Implemented through the «AddSongCommand» class, allowing for the execution and undoing of adding songs to the playlist. <br />

### Decorator Pattern: <br />
«ImageDecorator» and «ThemeDecorator» extend the functionality of a playlist by adding image and theme customization features. <br />

### Factory Pattern: <br />
«CustomPlaylistFactory» and «SmartPlaylistFactory» create instances of custom and smart playlists, respectively. <br />

### Strategy Pattern: <br />
«SortingStrategy» interface and its implementations («TitleSortStrategy» and «ArtistSortStrategy») enable dynamic sorting strategies in the «PlaylistContext». <br />
















## Conclusion 
### Key Points: <br />
The project successfully demonstrates the integration of multiple design patterns for a music playlist application. <br />
Notable patterns include Observer for notifications, Singleton for a single playlist manager instance, Command for undo/redo functionality, Decorator for customization, Factory for playlist creation, and Strategy for dynamic sorting. <br />

### Project Outcomes:
Successfully implemented a modular and extensible music playlist application. <br />
Challenges included coordinating interactions between various design patterns and ensuring seamless integration. <br />

### Future Improvements:
Enhance the user interface for a more interactive experience. <br />
Implement additional customization options and playlist management features. <br />
Explore integration with external APIs for song recommendations. <br />

In conclusion, the project achieved its objectives by effectively utilizing various design patterns, resulting in a well-organized and extensible music playlist application. Future improvements can further enhance the application's functionality and user experience. <br />

































