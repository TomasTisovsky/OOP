public class User {
    public User(String nickName, String password, String id) {
        this.nickName = nickName;
        this.password = password;
        this.id = id;
    }

    private String nickName;
    private String password;
    private String id;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
