import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Store store = new Store();

        Movie movie1 = new Movie("Dead pool","Fabian Nicieza","21315323",200,10,108);
        Movie movie2 = new Movie("Forrest Gump","Winston Groom","32443244",300,1,150);
        Movie movie3 = new Movie("As Summers Die","Winston Groom","53254432",100,10,90);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);



        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);



        Music music1 = new Music("Islands in the Stream","the Bee Gees","21323",11,10,"Kenny Rogers");
        Music music2 = new Music("Lookin' for Love","Wanda Mallette","5324523",30,2,"Johnny Lee");
        Music music3 = new Music("The Yellow Rose of Texas","johnny lee","21332423",66,3,"johnny lee");
        Music music4 = new Music("johnny lee cherokee fiddle","the Bee Gees","3244",5,10,"johnny lee");
        Music music5 = new Music("pickin' up strangers","johnny lee","765767",22,5,"johnny lee");


        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);
        store.addMedia(music5);



        Book book1 = new Book("One Up on Wall Street","Peter Lynch","48985623",4,10 , 200);

        book1.restock(2);
        Book book2 = new Book("Learn to Earn","Peter Lynch","5162312",10,0,219);
        book2.restock(1);
        Book book3 =  new Book("Rich Dad Poor Dad","Robert T. Kiyosak","5156231",15,10,210);
        book3.restock(3);

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);


        Novel novel1 = new Novel("The Great Gatsby"," F. Scott Fitzgerald","2313",11,10,230,"Literary fiction");
        novel1.restock(4);
        Novel novel2 = new Novel("Catch-22"," Joseph Heller","234342455",5,10,300,"War story");
        novel2.restock(1);

        store.addMedia(novel1);
        store.addMedia(novel2);

        AcademicBook academicBook1 = new AcademicBook("The Pragmatic Programmer"," Dave Thomas","2313443",5,10,230,"computer programming and software engineering,");
        academicBook1.restock(10);
        AcademicBook academicBook2 = new AcademicBook("Modern Software Engineering"," David farley","43242344",14,10,230,"Improve Your Creativity, Effectiveness, and Ultimately");
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
            System.out.println("Type number to enter media \n1. Book \n2. Movie \n3. Music \n4. Novel \n5. Academic Book \n6. Remove Media from cart \n7. Check out and Exit");
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
                        System.out.println("Shopping Cart :"+user.getShoppingCart());
                        do {
                            System.out.println("Enter ISBN number to remove from cart or type out to exit form shopping cart: ");
                            String ISBN6 = input.next();
                            if (ISBN6.equals("out"))break;
                            for (Media media : user.getShoppingCart()) {
                                if (media.getISBN().equals(ISBN6)) {
                                    user.removeFromCart(media);
                                    System.out.println("Removed from cart");
                                    break;
                                }
                            }

                        }while (true);
                        break;
                    case 7:
                    user.checkOut();
                    System.out.println("Thank you for using our service");
                    System.out.println("Type 1 if want make review on purchase or 2 to exit ");
                    if(input.nextInt() == 1){
                        for (Media media : user.getPurchaseMediaList()) {
                            do{
                                Review review = new Review();
                                String comment ="";
                                System.out.println(media.toString());
                                System.out.println("Please enter your rating between 1 and 5: ");
                                int rating = input.nextInt();
                                if(rating > 0 && rating < 6){
                                    System.out.println("Enter your comment: ");
                                    comment = input.next();
                                    review.setUsername(user.getUsername());
                                    review.setRating(rating);
                                    review.setComment(comment);
                                    media.addReview(review);
                                    System.out.println("Thank you for your review");
                                    break;
                                }else System.out.println("Wrong rating please Enter between 1 and 5");
                            }while(true);
                        }
                    }
                    break;
            }
            if(userInput != 7) System.out.println("Shopping Cart :"+user.getShoppingCart());

            if(userInput == 7){
                break;
            }
        }while(true);

        store.addUser(user);


        System.out.println("Purchase Media List :"+user.getPurchaseMediaList());

        System.out.println("Type 1 if want show review or 2 to exit ");
        if(input.nextInt() == 1){
            for(Media media: store.displayMedia()){
                for(Review review: media.getReview()){
                    System.out.println("Reviews : "+ review);
                }
            }
        }



    }


}