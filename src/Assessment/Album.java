package Assessment;

import java.util.Arrays;

public class Album {
    private String name;
    private String[] tracks;
    private String producer;
    private int releaseYear;
    private int PlayingTime;

    public Album(String name, String tracks[],String producer,int releaseYear){
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);


    }

    public Album(Song song) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == "" || name.equals(null))
            this.name="No Name Supplied";
        else
        this.name = name;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlayingTime(int playingTime) {
        PlayingTime = playingTime;
    }

    //public void getPlayingTime(int duration){
     //   tracks;
      //  this.PlayingTime = duration;
        

    public void playTrack(int trackId){
        playTrack(trackId);
        if(trackId>5 || trackId <0);

    }
    public static void Shuffle(){

    }
    @Override
    public String toString() {
        return  "Name: " + name +
                "\n\nProducer: " + producer +
                "\n\nNumber of Tracks: " + Arrays.toString(tracks) +
                "\n\nRelease Year: " + releaseYear;
        //        "\n\nTotal playing time: " + PlayingTime;
    }
}
