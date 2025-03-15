package lab1;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public Player() {
        this.number = 0;
        this.name = "";
        this.surname = "";
        this.position = "";
    }


    public String toString(){
        return this.number + " " + this.name + " " + this. surname + " " + this.position;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }
}
