package cu.jaco.fizzbuzz.ui.fizzbuzz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import cu.jaco.fizzbuzz.databinding.FragmentFizzBuzzBinding

class FizzBuzzFragment : Fragment() {

    private lateinit var binding: FragmentFizzBuzzBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFizzBuzzBinding.inflate(layoutInflater, container, false).apply {
            lifecycleOwner = this@FizzBuzzFragment
        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setSupportActionBar(binding.toolbar)
    }

    private fun setSupportActionBar(toolbar: Toolbar) {
        val activity = requireActivity()
        if (activity is AppCompatActivity)
            activity.setSupportActionBar(toolbar)
        else
            throw IllegalStateException("Activity must be AppCompatActivity")
    }
}