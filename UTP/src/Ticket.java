public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public void Ticket(Movie movie, int studioNumber, String seat){
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    // public String getTicketInfo(){
    //     return 
    // }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    // public int getTicketPrice() {
    //     return ;
    // }
}
