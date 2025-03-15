package lab1;

public abstract class User {
    private int id;
    private String login;
    private String password;




    // Default constructor
    public User() {
        this.id = 0;
        this.login = "";
        this.password = "";

    }




    // Parameterized constructor
    public User(int id, String login, String password,String name,String lastname) {
        this.id = id;
        this.login = login;
        this.password = password;

    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public abstract String getUserData();
}
