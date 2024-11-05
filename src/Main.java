import java.util.ArrayList;
import java.util.Scanner;

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



      //  ArrayList<Movie> movielist = store.getMediaByType(Movie.class);

        Scanner input = new Scanner(System.in);

        User user = new User();
        System.out.println("Enter username: ");
        user.setUsername(input.nextLine());
        System.out.println("Enter Email: ");
        user.setEmail(input.nextLine());
        System.out.println("Welcome to media store");
        do{
            System.out.println("Type number to enter media \n1. Book \n2. Movie \n3. Music \n4. Novel \n5. Academic Book \n6. Exit");
            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    ArrayList<Book> booklist = store.getMediaByType(Book.class);
                    for(Book book: booklist){
                        System.out.println(book+"\n"+book.getMediaType());
                    }
                    System.out.println("Type book you want to add cart: ");
                    String ISBN = input.next();
                    for(Book book: booklist){
                        if (book.getISBN().equals(ISBN)){
                            user.addToCart(book);
                        }
                    }
                    break;
                    case 2:
                    ArrayList<Movie> movielist = store.getMediaByType(Movie.class);
                    for(Movie movie: movielist){
                        System.out.println(movie+"\n"+movie.getMediaType());
                    }
                    System.out.println("Type movie you want to add cart: ");
                    String ISBN2 = input.next();
                    for(Movie movie: movielist){
                        if (movie.getISBN().equals(ISBN2)){
                            user.addToCart(movie);
                        }
                    }
                    break;
                    case 3:
                    ArrayList<Music> musiclist = store.getMediaByType(Music.class);
                    for(Music music: musiclist){
                        System.out.println(music+"\n"+music.getMediaType());
                    }
                    System.out.println("Type music you want to add cart: ");
                    String ISBN3 = input.next();
                    for(Music music: musiclist){
                        if (music.getISBN().equals(ISBN3)){
                            user.addToCart(music);
                        }
                    }
                    break;
                    case 4:
                    ArrayList<Novel> novellist = store.getMediaByType(Novel.class);
                    for(Novel novel: novellist){
                        System.out.println(novel+"\n"+novel.getMediaType());
                    }
                    System.out.println("Type novel you want to add cart: ");
                    String ISBN4 = input.next();
                    for(Novel novel: novellist){
                        if (novel.getISBN().equals(ISBN4)){
                            user.addToCart(novel);
                        }
                    }
                    break;
                    case 5:
                    ArrayList<AcademicBook> academicbooklist = store.getMediaByType(AcademicBook.class);
                    for(AcademicBook academicbook: academicbooklist){
                        System.out.println(academicbook+"\n"+academicbook.getMediaType());
                    }
                    System.out.println("Type academic book you want to add cart: ");
                    String ISBN5 = input.next();
                    for(AcademicBook academicbook: academicbooklist){
                        if (academicbook.getISBN().equals(ISBN5)){
                            user.addToCart(academicbook);
                        }
                    }
                    break;
                    case 6:
                    System.out.println("Thank you for using our service");
                    break;
            }
            System.out.println("Shooing Cart :"+user.getShoppingCart());
            if(userInput == 6){
                break;
            }
        }while(true);

        store.addUser(user);

        store.displayUser();
        store.displayMedia();

        System.out.println(user.getPurchaseMediaList());



    }
}