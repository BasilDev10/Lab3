import java.util.ArrayList;

public class Store {
    private ArrayList<User> users = new ArrayList<User>();
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

    public <T extends Media> ArrayList<T> getMediaByType(Class<T> type) {
        ArrayList<T> result = new ArrayList<>();
        for (Media media : media) {
            if (type.isInstance(media)) {
                result.add(type.cast(media));
            }
        }
        return result;
    }

}
