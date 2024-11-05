import java.util.ArrayList;
import java.util.Random;

public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private int stock;
    private double price;
    private ArrayList<Review> review = new ArrayList<>();

    public Media(){

    }
    public Media(String title, String auteur, String ISBN, double price, int stock) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
        this.stock = stock;
        for (int i = 0; i < 3; i++) {
            this.addReview(RandomReview());
        }

    }
    public void addReview(Review review){
        this.review.add(review);
    }

    public ArrayList<Review> getReview(){
        return review;
    }

    public double getAverageRating(){
        double avg = 0;
        for(Review review : review){
            avg += review.getRating();
        }
        return avg/review.size();
    }
    public boolean isBestseller(){
        if(getAverageRating() >=4.5){
            return true;
        }else return false;
    }
    public int getStock() {
        return stock;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String author) {
        this.auteur = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void restock(int quantity){

        this.stock += quantity;
        System.out.println("Media is been restock : "+quantity );
    }
    public String purchase(){
        if(this.stock > 0){
            this.stock--;
            return "Done";
        }else{
            System.out.println("Media is out of stock");
            return "Failed";
        }
    }

    public String getMediaType(){
        return "Media";
    }
    public String toString(){
        return "Title: "+title+"\nAuteur: "+auteur+"\nISBN: "+ISBN+"\nPrice: "+price+ "\nStock: " + this.stock +"\nAverage Rating: "+getAverageRating();
    }
    public Review RandomReview(){
        Random random = new Random();
        String randomUsername = "User" + (random.nextInt(100) + 1);
        int randomRating = random.nextInt(2) + 4;
        String randomComment = "This is a random review comment.";

        return new Review(randomUsername, randomRating, randomComment);
    }


}
