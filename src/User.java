import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media>  purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();
    public User(){

    }
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }
    public void addToCart(Media media){
        if(media.purchase().equals("Done")){
            shoppingCart.add(media);
        }

    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
        media.restock(1);
    }

    public void checkOut(){
        purchaseMediaList.addAll(shoppingCart);
        shoppingCart.clear();
    }
    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
