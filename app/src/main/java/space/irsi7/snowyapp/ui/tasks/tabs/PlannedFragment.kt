package space.irsi7.snowyapp.ui.tasks.tabs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.irsi7.snowyapp.R

class PlannedFragment : Fragment() {

    companion object {
        fun newInstance() = PlannedFragment()
    }

    private lateinit var viewModel: PlannedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_planned, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlannedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}