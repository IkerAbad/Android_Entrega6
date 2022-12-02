package dam.jesuitas.android_entrega6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import dam.jesuitas.android_entrega6.data.Datasource
import dam.jesuitas.android_entrega6.databinding.FragmentDetailBinding
import dam.jesuitas.android_entrega6.databinding.FragmentTitleBinding

class detailFragment : Fragment() {
    private  lateinit var binding: FragmentDetailBinding

    //Recibir argumentos
    val args: detailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        //SafeArgs
        val actors = args.actors
        val genre = args.genre
        val title = args.title
        val imageid = args.image
        val year = args.year
        val director = args.director

        binding.actionImage.setImageResource(imageid)
        binding.textViewTitle.setText(title)
        binding.textViewYear.setText(year)
        binding.textViewGenre.setText(genre)
        binding.textViewDirector.setText(director)

        val concat = binding.textViewTitle.text.toString() + " ("+ binding.textViewYear.text.toString()+")"
        binding.textConcat.text = concat

        var actorsString=""
        //Lista de actores
        actors.forEach { actorsString = it + "\n" + actorsString + "\n"}
        binding.textViewActors.setText(actorsString)
    }
}
