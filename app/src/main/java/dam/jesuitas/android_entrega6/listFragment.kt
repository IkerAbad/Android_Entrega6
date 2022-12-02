package dam.jesuitas.android_entrega6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import dam.jesuitas.android_entrega6.adapter.MovieAdapter
import dam.jesuitas.android_entrega6.data.Datasource
import dam.jesuitas.android_entrega6.databinding.FragmentListBinding
import dam.jesuitas.android_entrega6.databinding.FragmentTitleBinding

class listFragment : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myDataset = Datasource().loadMovies()
        val recyclerView = binding.listMovies

        recyclerView.adapter = MovieAdapter(this.requireContext(), myDataset)
        recyclerView.setHasFixedSize(true)
    }
}