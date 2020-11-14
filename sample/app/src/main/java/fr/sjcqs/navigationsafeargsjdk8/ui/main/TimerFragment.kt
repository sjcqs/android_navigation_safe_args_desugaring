package fr.sjcqs.navigationsafeargsjdk8.ui.main

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import fr.sjcqs.navigationsafeargsjdk8.R

class TimerFragment : Fragment(R.layout.timer_fragment) {

    private val args by navArgs<TimerFragmentArgs>()
    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        view.findViewById<TextView>(R.id.message).text = args.duration.toString()
    }
}
