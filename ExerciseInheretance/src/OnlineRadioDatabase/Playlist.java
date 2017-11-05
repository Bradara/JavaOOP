package OnlineRadioDatabase;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<Song> songs;
    private int durationTotal;
    private int durationInHours;
    private int durationInminutes;
    private int durationInSeconds;

    Playlist() {
        this.songs = new ArrayList<>();
        this.durationTotal = 0;
    }

    void addSongs(Song song){
        this.songs.add(song);
        System.out.println("Song added.");
        this.durationTotal += song.getMinutes()*60 + song.getSeconds();
    }

    void setDuration(){
        this.durationInHours = this.durationTotal / 3600;
        this.durationInminutes = (this.durationTotal / 60) % 60;
        this.durationInSeconds = this.durationTotal % 60;
    }

    @Override
    public String toString() {
        this.setDuration();
        return String.format("Songs added: %d%nPlaylist length: %dh %dm %ds",this.songs.size(), this.durationInHours, this.durationInminutes, this.durationInSeconds);
    }
}
