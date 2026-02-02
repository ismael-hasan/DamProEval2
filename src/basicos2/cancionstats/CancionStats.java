package basicos2.cancionstats;

public class CancionStats {

    // Atributos que pide el enunciado
    private String titulo;
    private int numeroDeReproducciones;

    // Creamos un constructor sólo pasándole el título; cuando creamos una canción nueva tiene 0 reproducciones.
    public CancionStats(String titulo) {
        this.titulo = titulo;
        this.numeroDeReproducciones = 0;
    }

    // Creamos el método que nos pide el enunciado, "reproducir()", que sume 1 a las reproducciones de esta canción.

    public void reproducir() {
        numeroDeReproducciones = numeroDeReproducciones+1;
        // alternativamente, más abreviado, podríamos poner
        // numeroDeReproducciones++;
    }

    // Añadimos getters para acceder a la info de la canción
    public int getNumeroDeReproducciones() {
        return numeroDeReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    // opcionalmente, sobreescribimos el método toString() como sigue para que
    // este método nos devuelva un String para mostrar, representativo de la canción
    @Override
    public String toString() {
        return "Canción: " + titulo + "\nReproducciones: " + numeroDeReproducciones;
    }
}
