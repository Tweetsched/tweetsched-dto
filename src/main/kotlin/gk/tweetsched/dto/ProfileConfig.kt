package gk.tweetsched.dto


/**
 * ProfileConfig class.
 * <p>
 * Date: June 26, 2018
 * <p>
 *
 * @author Gleb Kosteiko.
 */
data class ProfileConfig(var id: String? = null,
                         var profileId: String? = null,
                         var cronExpression: String? = null,
                         var consumerKey: String? = null,
                         var consumerSecret: String? = null,
                         var accessToken: String? = null,
                         var accessTokenSecret: String? = null)