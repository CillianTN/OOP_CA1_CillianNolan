package Assessment;

public class Song {
    private static int trackId =1;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title, String artist, String genre, int duration, int releaseYear){
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);

    }

    public static int getTrackId() {
        return trackId;
    }

    public static void setTrackId(int trackId) {
        Song.trackId = trackId;
    }

    public int getTrackNumber() {

        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        trackId++;
        this.trackNumber = trackId ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "\n\n\nTrack Number: " + trackId +
                "\nTitle: " + title +
                "\nArtist: " + artist +
                "\nGenre: " + genre +
                "\nDuration: " + duration +
                "\nRelease Year: " + releaseYear;
    }
}
