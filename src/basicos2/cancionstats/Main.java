package basicos2.cancionstats;

public class Main {
    public static void main(String[] args) {
        // Creamos una canción nueva
        CancionStats cancion = new CancionStats("Trollhamaren");

        // la reproducimos 100 veces
        for (int i=0; i<100;i++) {
            cancion.reproducir();
        }

        // Mostramos la canción
        System.out.println("La canción " + cancion.getTitulo() + " tiene " + cancion.getNumeroDeReproducciones() + " reproducciones");

        // Alternativamente, podemos usar el método toString que creamos para las canciones

        System.out.println(cancion.toString());
    }
}
