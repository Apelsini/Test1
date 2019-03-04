package class13java8;

import java.util.List;

/**
 * Created by user on 04.03.2019.
 */
public class Ex_1 {
    public static class Singer {
        String name;
        String homeTown;
    }

   public class Album {
        List<Song> songs;
    }

   public class Song {
        Singer singer;
        String title;
    }
}
