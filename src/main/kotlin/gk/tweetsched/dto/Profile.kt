package gk.tweetsched.dto

/**
 * Profile class.
 * <p>
 * Date: June 26, 2018
 * <p>
 *
 * @author Gleb Kosteiko.
 */
data class Profile(var id: String? = null,
                   var name: String? = null,
                   var passwordSha: String? = null)