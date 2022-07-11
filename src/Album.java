import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Album implements Comparable<Album>{
    int ID, songs;
    String title;
    ArrayList<String> artists = new ArrayList();
    public Album(int ID, int songs, String title, String @NotNull ... artist){
        this.ID = ID;
        this.songs = songs;
        this.title = title;
        for(int i = 0; i < artist.length; i++){
            artists.add(artist[i]);
        }
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.ID + ": " + this.songs + " -- ");
        for(int i = 0; i < this.artists.size(); i++){
            stringBuilder.append(this.artists.get(i));
            if(i != this.artists.size() - 1){
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Album other){
        return (this.songs - other.songs);
    }
}