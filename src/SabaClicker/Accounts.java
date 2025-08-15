package SabaClicker;

public class Accounts {
    private String username;
    private String password;

    public Accounts(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Accounts acc = (Accounts) obj;
        return username.equals(acc.username); // compare usernames only
    }

    @Override
    public int hashCode() {
        return username.hashCode(); // hash by username
    }

}
