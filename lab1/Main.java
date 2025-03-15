package lab1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(7,"Arnur","Zhailauov", "Md");
        Player[] players={player};
        Club club = new Club("Arnur","Kz",7, players);
        club.printClubData();

    }
}
