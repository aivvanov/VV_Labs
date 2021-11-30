public class User {
    String login;
    String pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User() {
        this.login = "";
        this.pass = "";
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}
