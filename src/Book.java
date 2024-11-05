import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> review = new ArrayList<>();

    public Book(){

    }
    public Book(String title, String auteur, String ISBN, double price){
        super(title, auteur, ISBN, price);
    }
    public void AddReview(Review review){
        this.review.add(review);
    }


    public double getAverageRating(){
        double avg = 0;
        for(Review review : review){
            avg += review.getRating();
        }
        return avg/review.size();
    }


    public void purchase(User user){
        if(this.stock > 0){
            this.stock--;
            user.checkOut();
        }else System.out.println("Book is out of stock");
    }
    public boolean isBestseller(){
        if(getAverageRating() >=4.5){
            return true;
        }else return false;
    }
    public void restock(int quantity){

        this.stock += quantity;
        System.out.println("book is been restock : "+quantity );
    }
    @Override
    public String getMediaType(){
        return this.isBestseller() == true ? "Bestselling book":"Book";
    }
    @Override
    public String toString(){
        return super.toString() + "\nStock: " + this.stock;
    }


}
