package OnlineRadioDatabase;

import OnlineRadioDatabase.SongException.InvalidSongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Playlist playlist = new Playlist();

        while (n-- > 0) {
            String[] songData = br.readLine().split(";");
            try {
                playlist.addSongs(new Song(songData[0], songData[1], songData[2]));
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(playlist);
    }
}
