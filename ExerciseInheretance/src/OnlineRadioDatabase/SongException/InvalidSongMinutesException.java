package OnlineRadioDatabase.SongException;

public class InvalidSongMinutesException extends InvalidSongLengthException{
    public InvalidSongMinutesException(String message) {
        super(message);
    }
}
