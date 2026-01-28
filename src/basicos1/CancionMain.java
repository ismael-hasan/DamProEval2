package basicos1;

/*
 * Esta clase es la clase en la que se inicia la ejecución del programa - la que tiene el método main.
 * En esta clase crearemos objetos de tipo Cancion e interaccionaremos con ellos.
 */
public class CancionMain {
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
        System.out.println("La canción " + c1.getTitulo() + " de " + c1.getArtista() + " dura " + c1.getDuracionEnSegundos());

        System.out.println("La canción " + c2.getTitulo() + " de " + c2.getArtista() + " dura " + c2.getDuracionEnSegundos());

        // Cambiamos la duración de c2 para que sea la más larga
        c2.setDuracionEnSegundos(350);

        // mostramos cual es la más larga
        if (c1.getDuracionEnSegundos()<c2.getDuracionEnSegundos()) {
            // La más larga es c1 si el código pasa por aquí
            System.out.println("Canción más larga: ");
            System.out.println("La canción " + c1.getTitulo() + " de " + c1.getArtista() + " dura " + c1.getDuracionEnSegundos());
        } else {
            // La más larga es c2 si el código pasa por aquí
            System.out.println("Canción más larga: ");
            System.out.println("La canción " + c2.getTitulo() + " de " + c2.getArtista() + " dura " + c2.getDuracionEnSegundos());
        }



    }
}
