package space.irsi7.snowyapp.ui.homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import space.irsi7.snowyapp.databinding.FragmentHomeworkBinding

class HomeworkFragment : Fragment() {

    private var _binding: FragmentHomeworkBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this)[HomeworkViewModel::class.java]

        _binding = FragmentHomeworkBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHomework
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}