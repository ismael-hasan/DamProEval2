package basicos1;

/*
* Esta clase es la clase con la que crearemos objetos de tipo Canción.
 */
public class Cancion {

    /*
     Definimos primero los 3 atributos que tendrá, los que se piden.
     Elegimos los tipos de datos adecuados para cada atributo.
     */
    private String titulo;
    private String artista;
    private int duracionEnSegundos;

    /*
    A continuación generamos los getters y los setters. Los getter simplemente devuelven
    el valor del atributo del objeto - el definido a nivel de clase.
    Los usaremos para acceder a los contenidos del objeto (para leerlos).
     */
    public String getTitulo() {
        return titulo;
    }

    /*
    Los setters dan un valor a cada atributo. Los usaremos para cambiar los contenidos
    del objeto. Fijaos en en que aunque el parámetro que recibe la función y el atributo de
    la clase tengan el mismo nombre, Java los diferencia. "this.asdasdad" será el atributo de
    la clase, y "asdasdad" será el parámetro de entrada.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }
}
