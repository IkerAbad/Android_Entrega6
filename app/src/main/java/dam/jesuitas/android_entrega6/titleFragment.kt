package dam.jesuitas.android_entrega6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import dam.jesuitas.android_entrega6.databinding.FragmentTitleBinding

class titleFragment : Fragment() {
    private  lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{this.findNavController().navigate(R.id.action_titleFragment_to_listFragment)}
    }

}