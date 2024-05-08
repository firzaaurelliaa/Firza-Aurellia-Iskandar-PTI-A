public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;



    public void Studio(String type){
        this.type = type;
    }

    // public String getStudioInfo(){
    //     return type;
    // } 

    public int isBooked(char row, int col){
        return row + col;
    }

    // public boolean reserve(char row, int col){
    //     return 
    // }

    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }
}
