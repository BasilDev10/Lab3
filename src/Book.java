import java.util.ArrayList;

public class Book extends Media{

    private int pageCount;

    public Book(){

    }
    public Book(String title, String auteur, String ISBN, double price,int stocks , int pageCount){
        super(title, auteur, ISBN, price, stocks);
        this.pageCount = pageCount;
    }


    public int getPageCount(){
        return pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }



    @Override
    public String getMediaType(){
        return super.isBestseller() == true ? "Bestselling book":"Book";
    }
    @Override
    public String toString(){
        return super.toString()+"\nPages count : "+getPageCount();
    }


}
