package uz.itschool.countries


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import uz.itschool.countries.adapter.UserAdapter
import uz.itschool.countries.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var users = createUser()
        var adapter = UserAdapter(this,users)
        binding.lv.adapter = adapter

        binding.lv.setOnItemClickListener { adapterView, view, i, l ->
            var user = users.get(i)
            var intent = Intent(this, UserActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }




    }

    private fun createUser() :MutableList<User>{
        var userList = mutableListOf<User>()
        for (i in 0..50){
//            if (i%2==0){
                userList.add(User("Alica +$i","user_login +$i",R.drawable.img1,"area:144"))
//            }else{
                userList.add(User("Ali +$i","user_login +$i",R.drawable.img2,"area:144"))
//            }
            userList.add(User("Uzbekistan","ss",R.drawable.uzb,"area:144"))
        }
        return userList
    }
}