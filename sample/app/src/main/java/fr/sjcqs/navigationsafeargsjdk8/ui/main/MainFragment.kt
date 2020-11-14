package fr.sjcqs.navigationsafeargsjdk8.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import fr.sjcqs.navigationsafeargsjdk8.R
import java.time.Duration

class MainFragment : Fragment(R.layout.main_fragment) {
    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        view.setOnClickListener {
            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToTimerFragment(Duration.ofSeconds(10))
            )
        }
    }
}
