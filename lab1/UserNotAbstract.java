package lab1;

public class UserNotAbstract {
    protected int identifier;
    protected String login;

    protected String password;

    protected String name;
    protected String last_name;

    public UserNotAbstract(int identifier, String login, String password, String name, String last_name) {
        this.identifier = identifier;
        this.login = login;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
    }

    public UserNotAbstract() {
        this.identifier = 0;
        this.login = "";
        this.password = "";
        this.name = "";
        this.last_name = "";
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "UserNotAbstract{" +
                "identifier=" + identifier +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

}
