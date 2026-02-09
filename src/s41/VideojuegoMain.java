package s41;

public class VideojuegoMain {

    public static void main(String[] args) {
        Item[] inventario = new Item[2];
        inventario[0] = new Item("poción a", 20, "Poción de vida");
        inventario[1] = new Item("poción b", 10, "Poción de maná");
        Jugador jugador = new Jugador("Pepe", 100, inventario);
        jugador.mostrarEstado();
    }
}
