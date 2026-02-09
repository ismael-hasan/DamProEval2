package s41;

public class Item {

    // Le hemos puesto a los objetos de inventario los siguientes 3 parámetros internos para definir su estado.
    private String nombre;
    private int cantidad;
    private String descripcion;

    public Item(String nombre, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    // Hemos creado getters; no es necesario según el enunciado si ya hacemos el último método @getTextoAMostrar()
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Este método sirve para decidir cómo mostramos Items. Si en el futuro cambiamos los Item para que tengan más parámetros y
    // queremos que salgan en su descripción, podemos simplemente cambiar este método. Todas aquellas clases que impriman Item
    // usando este método actualizan su comportamiento de forma implícita.
    public String getTextoAMostrar() {
        String resultado = nombre + ": " + cantidad + ". Su descripción es: " + descripcion;
        return resultado;
    }
}
