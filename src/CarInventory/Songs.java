package CarInventory;

public class Songs {

    //Title, Duration(as a minute) and Singer and Writer name for songs.

    private String title;
    private int duration;
    private String singer;
    private String nameSong;

    public Songs(String title, int duration, String singer, String nameSong) {
        this.title = title;
        this.duration = duration;
        this.singer = singer;
        this.nameSong = nameSong;
    }

    public String gettitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }


}











