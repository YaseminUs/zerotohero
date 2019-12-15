package CarInventory;

import java.util.ArrayList;
import java.util.Objects;

public class PlayLists {


    // Create one Playlist class to store songs to the playlist.
    String name;
    public PlayLists(String name){
      this.name=name;
    }
    //    Create one findSong method it will take the arraylist of song as a parameter
    //    and title of the song. The method return the Song if the title is avaliable inside the arraylist.

    public void findSong(ArrayList<Songs> playlist,String title){
    for(Songs s:playlist){
        System.out.println(s.gettitle());
    }
    }
    // Create one method to add the song to the playlist. This method take arraylist and Song as a parameter.
    // This method will return true if the song is added to the playlist.
    // If it is not added to the playlist it will return false. To be able to add the song to the playlist
    // there are three condition which you need to check. If title of the song is avaliable inside the playlist,
    // or song number inside playlist is more than 5 or total duration of the songs inside playlist is more than 20 min
    // you can not add the song to the arraylist.

    public boolean addSong(ArrayList<Songs> playlist ,String newSong) {

        int totalduration = 0;
        for (Songs s : playlist) {
            totalduration += s.getDuration();
            if (s.gettitle().equalsIgnoreCase(newSong) || playlist.size() > 5 || totalduration > 20) {
                System.out.println("you can not add the song ");
                return false;

            }
        }
                return true;
    }

    // Create one method to remove the song from the playlist. This method take arraylist and Title  as a parameter.
    // This method will return true if the song is removed from the playlist. First you need to check the title of the song.
    // If title is avaliable is your playlist, you can remove the Song from the list.

    public void removeSong(ArrayList<Songs> playlist , String title){
        for(int i=0;i<playlist.size();i++)
            if(playlist.get(i).gettitle().equalsIgnoreCase(title)){
                playlist.remove(i);

            }

    }
    //Create one method to play your playlist. This method will take one parameter as a arraylist of song.
    // It will play all the songs which is avaliable in your playlist. The output of the method will be like following example:

    public void myplaylist(ArrayList<Songs> playlist) {
        for (Songs s : playlist) {
            System.out.println(s.gettitle()+" is playing duration is "+s.getDuration());
        }

    }

    public static void main (String[]args){

            Songs name1 = new Songs("Pop", 3, "Ariana", "Popular");
            Songs name2 = new Songs("Classic", 4, "Celin Dion", "My life");
            Songs name3 = new Songs("Rap", 5, "JZ", "forever");
            Songs name4 = new Songs("Pop", 2, "Selena", "Beutiful");

            PlayLists name =new PlayLists("my play list");
            ArrayList<Songs> playlist = new ArrayList<Songs>();

             playlist.add(name1);
             playlist.add(name2);
             name.myplaylist(playlist);

        }

    }