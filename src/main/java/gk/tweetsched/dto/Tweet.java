package gk.tweetsched.dto;

/**
 * Tweet class.
 * <p>
 * Date: June 21, 2018
 * <p>
 *
 * @author Gleb Kosteiko.
 */
public class Tweet {
    private String id;
    private String profileId;
    private String message;

    public Tweet() {}

    public Tweet(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getProfileId() {
        return profileId;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Tweet setMessage(String message) {
        this.message = message;
        return this;
    }
}
