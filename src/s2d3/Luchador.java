package s2d3;

import java.util.Random;

public class Luchador {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Luchador(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void mostrarEstado() {
        System.out.println(" A " + nombre + " le quedan " + vida + " de vida");
    }

    public int ataca() {
        Random random = new Random();
        double multiplier = random.nextDouble(0.6,1.4);
        return (int) (ataque*multiplier);
    }

    public boolean recibeDanho(int danhoRecibido) {
        int danhoRealRecibido = danhoRecibido - defensa;
        if (danhoRealRecibido <0) {
            danhoRealRecibido = 0;
        }
        vida = vida - danhoRealRecibido;

        if (vida<0) {
            vida = 0;
        }
        boolean esDerrotado;
        if (vida==0) {
            esDerrotado = true;
        } else {
            esDerrotado = false;
        }
        return esDerrotado;
    }

}
