package s2d3;

import java.util.Random;

public class Main {
    public static void main (String[] args) {

        // Crear array de luchadores
        // Comenzar un bucle que para sólo cuando queda uno vivo
          // Seleccionar un luchador vivo aleatorio - l1
          // Seleccionar un luchador vivo aleatorio que no sea l1
          // Pelear l1 y l2
          // Comprobar si queda más de un luchador vivo para cambiar la variable de control
        // Recorrer el bucle para encontrar al luchador vivo e imprimir que ha ganado

        // Crear array de luchadores
        Random rand = new Random();

        int numeroDeLuchadores = 10 ;

        Luchador [] luchadores = new Luchador[numeroDeLuchadores];
        for (int i = 0; i<luchadores.length; i++) {
            luchadores[i]  = new Luchador("nombre "+i,
                    rand.nextInt(80,120),
                    rand.nextInt(40,80),
                    rand.nextInt(20,40));
        }

        boolean quedaMasDeUnoVivo = true;

        // Comenzar un bucle que para sólo cuando queda uno vivo
        while (quedaMasDeUnoVivo) {
            Luchador l1 = null;
            Luchador l2 = null;

            boolean luchadorEsValido = false;

            // Buscamos un luchador aleatorio que esté vivo.
            while (!luchadorEsValido) {
                l1 = luchadores[rand.nextInt(luchadores.length)];
                if (l1.getVida()>0) {
                    luchadorEsValido = true;
                }
            }
            // buscamos el segundo luchador vivo, no puede ser el primero
            boolean luchador2EsValido = false;
            while (!luchador2EsValido) {
                l2 = luchadores[rand.nextInt(luchadores.length)];
                if (l2.getVida()>0 && l2!=l1) {
                    luchador2EsValido = true;
                }
            }
            // los ponemos a pelear
            pelea(l1,l2);

            int numeroLuchadoresVivos = 0;
            // comprobamos cuantos luchadores quedan vivos
            for (Luchador luchador:luchadores) {
                if (luchador.getVida()>0) {
                    numeroLuchadoresVivos = numeroLuchadoresVivos +1;
                }
            }

            if (numeroLuchadoresVivos<=1) {
                quedaMasDeUnoVivo = false;
            }
        }

        // Una vez que salimos del bucle, es porque sólo hay 1 luchador vivo.
        for (Luchador actual:luchadores) {
            if (actual.getVida()>0) {
                System.out.println("El ganador es " + actual.getNombre());
                break;
            }
        }



    }

    // Función para poner a 2 luchadores a pelear. Pelean hasta que uno queda derrotado.
    // Devuelve el luchador que ha ganado.
    private static Luchador pelea(Luchador luchador1, Luchador luchador2) {
        Luchador ganador = null;
        while (luchador1.getVida()>0 && luchador2.getVida()>0) {
            int ataqueRyu = luchador1.ataca();
            System.out.println(luchador1.getNombre() + " ataca por " + ataqueRyu);
            boolean kenDerrotado = luchador2.recibeDanho(ataqueRyu);
            luchador2.mostrarEstado();
            if (kenDerrotado) {
                ganador = luchador1;
                   continue;
            }
            int ataqueKen = luchador2.ataca();
            System.out.println(luchador2.getNombre() + " ataca por " + ataqueKen);
            boolean ryuDerrotado = luchador1.recibeDanho(ataqueKen);
            luchador1.mostrarEstado();
            System.out.println("A " + luchador1.getNombre() + " le quedan " + luchador1.getVida() + " puntos de vida.");
            if (ryuDerrotado) {
                ganador = luchador2 ;
            }
        }
        return ganador;
    }


   
}
