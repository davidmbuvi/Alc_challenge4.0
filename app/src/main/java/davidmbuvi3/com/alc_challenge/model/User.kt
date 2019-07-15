package davidmbuvi3.com.alc_challenge.model

import davidmbuvi3.com.alc_challenge.R


data class User(val profileUrl:Int, val username : String,
           val track: String, val country : String,
           val email:String,val phoneno: String,
           val slack:String)

object Supplier{
    val user= User(
        R.drawable.davie,
        "David Mbuvi Musau",
        "Track: Android",
        "Country: Kenya",
        "Email: davidmbuvi3@gmail.com",
        "PhoneNumber: +254790490644",
        "Slack Username: @DavidMbuviMusau"
    )
}
