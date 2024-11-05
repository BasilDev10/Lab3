import java.util.ArrayList;

public class Movie extends Media{
    private int duration;
    public Movie(){

    }
    public Movie(String title, String auteur, String ISBN, double price,int stocks, int duration){
        super(title, auteur, ISBN, price, stocks);
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public void watch(User user){
        user.checkOut();
    }
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movies){
        ArrayList<Movie> similarMovies = new ArrayList<>();
        for(Movie movie: movies){
            if(movie.getAuteur() == this.getAuteur()){
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }
    @Override
    public String getMediaType(){
        return this.duration >= 120 ?"Long Movie": "Movie";
    }
    @Override
    public String toString(){
        return super.toString() + "\nDuration: " + duration;
    }

}
