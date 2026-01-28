package basicos1;

/*
 * Esta clase es la clase en la que se inicia la ejecución del programa - la que tiene el método main.
 * En esta clase crearemos objetos de tipo Cancion e interaccionaremos con ellos.
 */
public class CancionMainAlternativa {
    public static void main(String [] args) {
        // Creamos ambos objetos
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();

        // Seteamos las propiedades/atributos/estado del primero
        c1.setArtista("art1ista");
        c1.setTitulo("titulo1");
        c1.setDuracionEnSegundos(300);

        // Seteamos las propiedades/atributos/estado del segundo
        c2.setArtista("art1ista");
        c2.setTitulo("titulo1");
        c2.setDuracionEnSegundos(200);

        // Mostramos los datos de cada uno por pantalla
        // Sustituimos las siguientes líneas por llamar a la función que imprime, que recibe el objeto que hay que imprimir como parámetro.
        // System.out.println("La canción " + c1.getTitulo() + " de " + c1.getArtista() + " dura " + c1.getDuracionEnSegundos());
        // System.out.println("La canción " + c2.getTitulo() + " de " + c2.getArtista() + " dura " + c2.getDuracionEnSegundos());
        imprimirCancion(c1);
        imprimirCancion(c2);

        // Cambiamos la duración de c2 para que sea la más larga
        c2.setDuracionEnSegundos(350);

        // mostramos cual es la más larga
        if (c1.getDuracionEnSegundos()>c2.getDuracionEnSegundos()) {
            // La más larga es c1 si el código pasa por aquí
            System.out.println("Canción más larga: ");
            imprimirCancion(c1);
        } else {
            // La más larga es c2 si el código pasa por aquí
            System.out.println("Canción más larga: ");
            imprimirCancion(c2);
        }
    }

    /*
     Como nota, este método:
     - Es private. Eso quiere decir que sólo se puede llamar a este método desde la clase Java en la que lo hemos creado. Como sólo lo queremos usar en esta clase, lo hacemos private.
     - Es static. Lo estamos llamando desde el main, que también es static; desde un método static sólo podemos llamar a métodos static (o crear objetos y llamar a métodos de objetos).
       Más adelante profundizaremos en esto.
     - No devuelve nada (void). Cuando llamamos a este método, no lo hacemos para obtener un resultado que podamos usar en nuestro código; lo llamamos para que
       haga una función/tarea. Por eso no necesita devolver ningún valor.
     - Recibe como argumento/parámetro el objeto de tipo Cancion a imprimir. Así, cuando lo llamemos con la canción "c1", cancionAImprimir será c1.                                                                                                                                             
     */
    private static void imprimirCancion(Cancion cancionAImprimir) {
        System.out.println("La canción " + cancionAImprimir.getTitulo() + " de " + cancionAImprimir.getArtista() + " dura " + cancionAImprimir.getDuracionEnSegundos());
    }
}
