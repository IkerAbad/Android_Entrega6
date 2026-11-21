# Android_Entrega6

Entrega de Android del ciclo de DAM (diciembre de 2022). Es una app en Kotlin con una lista de películas: una pantalla de bienvenida, la lista y una pantalla de detalle de cada película, navegando entre ellas con fragmentos y el componente de navegación de Jetpack.

## Qué hay

- `titleFragment`, `listFragment` y `detailFragment`, conectados en `res/navigation/navigation.xml`.
- `Movies.kt` es el modelo: título, género, director, imagen, actores y año.
- `Datasource.kt` carga las películas escritas a mano, y `MovieAdapter.kt` las muestra en la lista.

## Cómo abrirlo

Abre la carpeta en Android Studio, deja que Gradle sincronice y ejecútala en un emulador o en un móvil (`minSdk 21`, `compileSdk 33`). No la he compilado desde el entorno en el que escribí este README.

## Imágenes

Las imágenes de las películas son de sus respectivos autores y no están cubiertas por la licencia del código.

---

# Android_Entrega6 (English)

Android hand-in from my DAM vocational course (December 2022). A Kotlin app with a list of movies: a welcome screen, the list, and a detail screen for each movie, navigating between them with fragments and Jetpack Navigation.

## What's inside

- `titleFragment`, `listFragment` and `detailFragment`, connected in `res/navigation/navigation.xml`.
- `Movies.kt` is the model: title, genre, director, image, actors and year.
- `Datasource.kt` loads the hardcoded movies, and `MovieAdapter.kt` shows them in the list.

## Opening it

Open the folder in Android Studio, let Gradle sync and run it on an emulator or a phone (`minSdk 21`, `compileSdk 33`). I have not compiled it in the environment where I wrote this README.

## Images

The movie pictures belong to their respective owners and are not covered by the code licence.
