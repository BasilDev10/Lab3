public class Novel extends Book {
    private String genre;
    public Novel() {

    }
    public Novel(String title, String auteur, String ISBN, double price,int stocks,int pageCount, String genre) {
        super(title, auteur, ISBN, price, stocks ,pageCount);
        this.genre = genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType(){
        return super.isBestseller() == true ? "Bestselling Novel":"Novel";
    }
    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }
}
