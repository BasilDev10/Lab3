public class AcademicBook extends Book {
    private String subject;

    public AcademicBook(){

    }
    public AcademicBook(String title, String auteur, String ISBN, double price,int stocks,int pageCount, String subject) {
        super(title, auteur, ISBN, price, stocks,pageCount);
        this.subject = subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }

    @Override
    public String getMediaType(){
        return super.isBestseller() == true ? "Bestselling AcademicBook":"AcademicBook";
    }
    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}
