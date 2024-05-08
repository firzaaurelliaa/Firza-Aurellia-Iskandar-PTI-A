public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity){
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init(){

    }

    // public boolean registerUser(User user){
        
    // }

    // public User autheticateUser(String email, String password){
    //     return ;
    // }

    public void displayListStudio(){

    }

    public void displayStudioDetail(int studioNumber){

    }

    // public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres){
    //     return 
    // }


    // public boolean bookTicket(User user, int studioNumber, char row, int col){
    //     return
    // }

    public String getName() {
        return name;
    }
}
