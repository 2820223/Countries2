package uz.itschool.countries.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.itschool.countries.R
import uz.itschool.countries.User
import uz.itschool.countries.databinding.ItemUserBinding


class UserAdapter(context: Context, var users: MutableList<User>) : ArrayAdapter<User>(
    context,
    R.layout.item_user, users
) {

    override fun getCount(): Int {
        return users.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var binding: ItemUserBinding
        if (convertView == null) {
            binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        }else{
            binding= ItemUserBinding.bind(convertView)
        }
        val user = users.get(position)
        binding.img.setImageResource(user.img)
        binding.name.text = user.name
        binding.population.text = user.login
        binding.area.text = user.area
        return binding.root
    }
}