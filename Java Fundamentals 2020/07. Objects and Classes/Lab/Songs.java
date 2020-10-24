import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {
        String listType;
        String name;
        String time;

        public String getListType() {
            return listType;
        }

        public void setListType(String listType) {
            this.listType = listType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numSongs; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song();

            song.setListType(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String command = scanner.nextLine();
        List<Song> filterSons = new ArrayList<>();

        if ("all".equals(command)) {
            filterSons.addAll(songs);
        } else {
            for (Song song : songs) {
                if (song.getListType().equals(command)) {
                    filterSons.add(song);
                }
            }
        }
        for (Song song : filterSons) {
            System.out.println(song.getName());
        }
    }
}