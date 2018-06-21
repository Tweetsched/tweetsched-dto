package gk.tweetsched.dto;

/**
 * Profile class.
 * <p>
 * Date: June 21, 2018
 * <p>
 *
 * @author Gleb Kosteiko.
 */
public class Profile {
    private String id;
    private String name;
    private String passwordSha;

    public Profile() {}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswordSha() {
        return passwordSha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswordSha(String passwordSha) {
        this.passwordSha = passwordSha;
    }
}
