package s41;

public class Jugador {
    private String nombre;
    private int vida;
    private Item[] inventario;

    // Creamos el jugador con los atributos/variables internas que necesita
    public Jugador(String nombre, int vida, Item[] inventario) {
        this.nombre = nombre;
        this.vida = vida;
        this.inventario = inventario;
    }

    // Mostramos el estado del jugador. El enunciado es flexible, así que mostramos el nombre, la vida, cuantos objetos tiene en su inventario y qué objetos.
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);

        System.out.println("Inventario: " +inventario.length + " objetos.");

        for (Item item:inventario) {
            System.out.println(item.getTextoAMostrar());
        }


    }

}
