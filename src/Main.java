import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Store store = new Store();

        Movie movie1 = new Movie("Dead pool","Fabian Nicieza","21315323",200,108);
        Movie movie2 = new Movie("Forrest Gump","Winston Groom","32443244",300,150);
        Movie movie3 = new Movie("As Summers Die","Winston Groom","53254432",100,90);


        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        System.out.println(movie2.recommendSimilarMovies(movies));


        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);



        Music music1 = new Music("Islands in the Stream","the Bee Gees","21323",11,"Kenny Rogers");
        Music music2 = new Music("Lookin' for Love","Wanda Mallette","5324523",30,"Johnny Lee");
        Music music3 = new Music("The Yellow Rose of Texas","johnny lee","21332423",66,"johnny lee");
        Music music4 = new Music("johnny lee cherokee fiddle","the Bee Gees","3244",5,"johnny lee");
        Music music5 = new Music("pickin' up strangers","johnny lee","765767",22,"johnny lee");

        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);
        store.addMedia(music5);



        Book book1 = new Book("One Up on Wall Street","Peter Lynch","48985623",4);
        book1.restock(10);
        Book book2 = new Book("Learn to Earn","Peter Lynch","5162312",10);
        book2.restock(10);
        Book book3 =  new Book("Rich Dad Poor Dad","Robert T. Kiyosak","5156231",15);
        book2.restock(10);

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);


        Novel novel1 = new Novel("The Great Gatsby"," F. Scott Fitzgerald","2313",11,"Literary fiction");
        novel1.restock(10);
        Novel novel2 = new Novel("Catch-22"," Joseph Heller","2313443",5,"War story");
        novel2.restock(10);

        store.addMedia(novel1);
        store.addMedia(novel2);

        AcademicBook academicBook1 = new AcademicBook("The Pragmatic Programmer"," Dave Thomas","2313443",5,"computer programming and software engineering,");
        academicBook1.restock(10);
        AcademicBook academicBook2 = new AcademicBook("Modern Software Engineering"," David farley","43242344",14,"Improve Your Creativity, Effectiveness, and Ultimately");
        academicBook2.restock(10);

        store.addMedia(academicBook1);
        store.addMedia(academicBook2);

        //System.out.println(store.displayMedia());
     //   System.out.println(store);


    }
}