import java.util.ArrayList;

public class Album implements Comparable{
    int ID, songs;
    String title;
    ArrayList<String> artists = new ArrayList();
    public Album(int ID, int song, String title, String... artist){
        this.ID = ID;
        this.songs = song;
        this.title = title;
        for(int i = 0; i < artist.length; i++){
            artists.add(artist[i]);
        }
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(ID + ": " + songs + " -- ");
        for(int i = 0; i < artists.size(); i++){
            stringBuilder.append(artists.get(i) + " ");
        }

        return stringBuilder.toString();
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}