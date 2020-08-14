package cu.jaco.fizzbuzz.ui.fizzbuzz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cu.jaco.fizzbuzz.databinding.ItemFizzBuzzBinding
import cu.jaco.fizzbuzz.model.FizzBuzzNumber

class FizzBuzzAdapter : RecyclerView.Adapter<FizzBuzzAdapter.FizzBuzzViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FizzBuzzViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemFizzBuzzBinding.inflate(layoutInflater, parent, false)
        return FizzBuzzViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = 100


    override fun onBindViewHolder(holder: FizzBuzzViewHolder, position: Int) {
        holder.bind(FizzBuzzNumber(position + 1))
    }

    inner class FizzBuzzViewHolder(private val binding: ItemFizzBuzzBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: FizzBuzzNumber) {

            binding.number = item
            binding.executePendingBindings()

        }

    }

}