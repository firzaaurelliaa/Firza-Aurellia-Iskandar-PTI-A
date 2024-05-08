public class Movie {
    private String title;
    private double rating;
    private String[] genres;

    public void Movie(String title, double rating ){
        this.title = title;
        this.rating = rating;
    }

    public void Movie(String title, double rating, String[] genres){
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }
     
    public String[] getGenres() {
        return genres;
    }   

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}
