import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> media = new ArrayList<Media>();
    public Store() {

    }
    public void addUser(User user){
        this.users.add(user);
    }

    public ArrayList<User> displayUser() {
        return users;
    }
    public void addMedia(Media media){
        this.media.add(media);
    }
    public ArrayList<Media> displayMedia() {
        return media;
    }
    public Book searchBookByTitle(String title){

        Book book = null;
        for(Media media : media){
            if(media.getTitle().equals(title)){
                book = (Book) media;
                break;
            }
        }
        return book;
    }

}
