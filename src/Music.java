import java.util.ArrayList;

public class Music extends Media {
    private String artist;
    public Music(){

    }
    public Music(String title, String auteur, String ISBN, double price , String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void listen(User user){
        System.out.println(user.getUsername() +" is Listening music song sung by : "+getArtist());
    }
    public ArrayList<Music> generatePlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if(music.getArtist().equals(getArtist())){
                playlist.add(music);
            }
        }
        return playlist;
    }

    @Override
    public String getMediaType(){
        return super.getPrice() >= 10 ? "Premium Music":"Music";
    }
    @Override
    public String toString(){
        return super.toString() +"\nArtist: "+getArtist();
    }


}
