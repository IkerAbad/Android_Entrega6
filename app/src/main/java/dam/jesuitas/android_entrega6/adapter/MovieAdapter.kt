package dam.jesuitas.android_entrega6.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import dam.jesuitas.android_entrega6.R
import dam.jesuitas.android_entrega6.databinding.ListMoviesBinding
import dam.jesuitas.android_entrega6.listFragmentDirections
import dam.jesuitas.android_entrega6.model.Movies

class MovieAdapter(val context: Context, val dataset: List<Movies>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){
        val director: TextView = view.findViewById(R.id.director)
        val tituloPelicula: TextView = view.findViewById(R.id.titulo_pelicula)
        val image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_movies, parent, false)
        return MovieViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        //Binding
        val item = dataset[position]
        holder.tituloPelicula.text = context.resources.getString(item.title)
        holder.director.text = context.resources.getString(item.director)
        holder.image.setImageResource(item.image)

        //Navegacion Details
        holder.image.setOnClickListener{view ->
           //SafeArgs
            val actors = item.actors
            val genre = item.genre
            val title = item.title
            val imageid = item.image
            val year = item.year
            val director = item.director
            val action = listFragmentDirections.actionListFragmentToDetailFragment(imageid,actors,title,genre,year,director)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int =dataset.size

}