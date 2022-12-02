package dam.jesuitas.android_entrega6.data

import dam.jesuitas.android_entrega6.R
import dam.jesuitas.android_entrega6.model.Movies

public class Datasource {
    fun loadMovies(): List<Movies> {
        return listOf<Movies>(
            Movies(
                R.string.arca_perdida,
                R.string.aventuras,
                R.string.arca_perdida_director,
                R.drawable.arca_perdida,
                arrayOf("Harrison Ford", "Karen Allen", "Paul Freeman"),
                R.string.arca_perdida_year
            ), Movies(
                R.string.interstellar,
                R.string.ciencia_ficcion,
                R.string.interstellar_director,
                R.drawable.interstellar,
                arrayOf("Mathew MacConaughey", "Jessica Chastain", "Anne Hathaway"),
                R.string.interstellar_year
            ), Movies(
                R.string.el_golpe,
                R.string.comedia,
                R.string.el_golpe_director,
                R.drawable.el_golpe,
                arrayOf("Robert Redford", "Paul Newman", "Robert Shaw"),
                R.string.el_golpe_year
            ), Movies(
                R.string.platoon,
                R.string.belica,
                R.string.platoon_director,
                R.drawable.platoon,
                arrayOf("Willem Dafoe", "Charlie Sheen", "Tom Berenger"),
                R.string.platoon_year
            ), Movies(
                R.string.vida_bella,
                R.string.drama,
                R.string.vida_bella_director,
                R.drawable.la_vida_es_bella,
                arrayOf("Nicoleta Braschi", "Giorgio  Cantarini", "Horst Buchhold"),
                R.string.vida_bella_year
            ), Movies(
                R.string.toy_story,
                R.string.infantil,
                R.string.toy_story_director,
                R.drawable.toy_story,
                arrayOf("Tom Hanks", "Nathan Lane", "Erik von Detten"),
                R.string.toy_story_year
            )
        )
    }

}