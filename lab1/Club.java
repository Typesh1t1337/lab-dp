package lab1;

public class Club {
    String name;
    String country;
    int rating;
    Player[] players;

    public Club(String name, String country, int rating, Player[] players) {
        this.name = name;
        this.country = country;
        this.rating = rating;
        this.players = players;
    }
    public Club() {
        this.rating = 0;
        this.name = "";
        this.country = "";
        this.players = new Player[0];
    }

    public void printClubData(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Rating: " + rating);
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
