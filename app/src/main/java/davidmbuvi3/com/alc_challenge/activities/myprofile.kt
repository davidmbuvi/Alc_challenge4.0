package davidmbuvi3.com.alc_challenge.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import davidmbuvi3.com.alc_challenge.R
import davidmbuvi3.com.alc_challenge.model.Supplier.user
import davidmbuvi3.com.alc_challenge.model.User
import kotlinx.android.synthetic.main.activity_mypr.*
import kotlinx.android.synthetic.main.profile.view.*

class myprofile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypr)
        val adapter= GroupAdapter<ViewHolder>()
        adapter.add(ProfileItem(user))
        profile_recyclerview.adapter=adapter
    }
}
class ProfileItem(val  user: User): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        Picasso.get().load(user.profileUrl).into(viewHolder.itemView.profileimage)
        viewHolder.itemView.Username.text= user.username
        viewHolder.itemView.track.text=user.track

        viewHolder.itemView.country.text=  user.country
        viewHolder.itemView.email.text=user.email
        viewHolder.itemView.phoneno.text=user.phoneno
        viewHolder.itemView.slackusername.text=user.slack
    }
    override fun getLayout(): Int {
      return R.layout.profile
    }



}
