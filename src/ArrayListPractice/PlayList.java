package ArrayListPractice;

import java.util.ArrayList;

public class PlayList {

    // Create a program that implements a playlist for songs.
    // Create one Song class having Title, Duration(as a minute) and Singer and Writer name for songs.
    // Create three argument constructor to initialize the instance variables of the Song class.
    // Create getters and setters for intance variables of the Song class.
    // Using Song class create 10 instance(object) of the song class.
    //
    // 1- Create one Playlist class to store songs to the playlist.
    // 2- Create one findSong method it will take the arraylist of song as a parameter
    // and title of the song. The method return the Song if the title is avaliable inside the arraylist.

    // 3- Create one method to add the song to the playlist. This method take arraylist and Song as a parameter.
    // This method will return true if the song is added to the playlist.
    // If it is not added to the playlist it will return false. To be able to add the song to the playlist
    // there are three condition which you need to check. If title of the song is avaliable inside the playlist,
    // or song number inside playlist is more than 5 or total duration of the songs inside playlist is more than 20 min
    // you can not add the song to the arraylist.

    // 4- Create one method to remove the song from the playlist. This method take arraylist and Title  as a parameter.
    // This method will return true if the song is removed from the playlist. First you need to check the title of the song.
    // If title is avaliable is your playlist, you can remove the Song from the list.
    // 5- Create one method to play your playlist. This method will take one parameter as a arraylist of song.
    // It will play all the songs which is avaliable in your playlist. The output of the method will be like following example:
    //
    // EXAMPLE: Considering you have 3 song in your playlist:
    // 1- Song: Don’t stop believing is playing. Duration is 3.15.
    // 2- Song: Harder, Better, Fast is playing. Duration is 2.55.
    // 3- All I Do Is Win is playing. Duration is 4.22.


    private String name;

    public PlayList(String name) {

    }

    public void findSong(ArrayList<Song> playList, String Title) {
        for (Song s : playList) {
            System.out.println(s.getTitle());
        }
    }

    public boolean addSong(ArrayList<Song> playList, String newSong) {

        int duration = 0;
        for (Song s : playList) {
            duration += s.getDuration();
            if (s.getTitle().equalsIgnoreCase(newSong) && playList.size() > 5 && duration > 20) {
                System.out.println("This song is already in your inventory");
                return false;
            }

        }
        //playList.add(newSong);
        return true;
    }
    public void removeSong(ArrayList<Song>playList,String Title){
for(int i=0;i<playList.size();i++){
    if(playList.get(i).getTitle().equalsIgnoreCase(Title)){
        playList.remove(i);
    }
}
    }








    public static void main (String[]args){


            Song name1 = new Song("Pop", 3, "Ariana", "Popular");
            Song name2 = new Song("Classic", 3, "Celin Dion", "My Life");
            Song name3 = new Song("RAP", 4, "JZ", "forever young");
            Song name4 = new Song("KPOP", 5, "BTC", "Boys love sing");
            Song name5 = new Song("Pop", 2, "Selena", "Beautiful");



            PlayList  name = new PlayList("jasmine");


            ArrayList<Song> playList = new ArrayList<Song>();
            playList.add(name1);
            playList.add(name2);

        }
    }
