package uz.itschool.countries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.countries.databinding.ActivityUserBinding


class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var user: User = intent.getSerializableExtra("user") as User
        binding.userimg.setImageResource(user.img)
        binding.username.text = user.name
    }
}