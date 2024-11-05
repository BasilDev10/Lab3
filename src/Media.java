public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    public Media(){

    }
    public Media(String title, String auteur, String ISBN, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
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
    public String getMediaType(){
        return "Media";
    }
    public String toString(){
        return "Title: "+title+"\nAuteur: "+auteur+"\nISBN: "+ISBN+"\nPrice: "+price;
    }

}
