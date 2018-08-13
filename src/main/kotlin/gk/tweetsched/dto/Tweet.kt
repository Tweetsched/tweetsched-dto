package gk.tweetsched.dto

/**
 * Tweet class.
 * <p>
 * Date: June 26, 2018
 * <p>
 *
 * @author Gleb Kosteiko.
 */
data class Tweet(var id: String? = null,
                 var profileId: String? = null,
                 var message: String? = null,
                 var publishedTo: Map<Service, Boolean>? = null)
