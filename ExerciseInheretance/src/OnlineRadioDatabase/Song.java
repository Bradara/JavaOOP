package OnlineRadioDatabase;

import OnlineRadioDatabase.SongException.*;

public class Song {
    private String artistName;
    private String songName;
    private int minutes;
    private int seconds;

    Song(String artistName, String songName, int minutes, int seconds) throws InvalidSongException {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    Song(String artistName, String songName, String songLength) throws InvalidSongException {
        this.setArtistName(artistName);
        this.setSongName(songName);
        setLength(songLength);
    }

    private void setLength(String songLength) throws InvalidSongLengthException{
        String[] data = songLength.split(":");
        int m, s;
        try {
            m = Integer.parseInt(data[0]);
            s = Integer.parseInt(data[1]);
        } catch (Exception e){
            throw new InvalidSongLengthException("Invalid song length.");
        }
            this.setMinutes(m);
            this.setSeconds(s);
    }

    int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }

        this.artistName = artistName;
    }

    void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }

        this.songName = songName;
    }

    void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds < 0 || seconds > 59) {
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }
}
