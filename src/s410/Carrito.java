package s410;

public class Carrito {

    private Producto[] productos;

    public Carrito() {
        this.productos = new Producto[0];
    }

    public void anhadirProducto(Producto p) {
        Producto[] nuevoCarrito = new Producto[productos.length+1];
        for (int i=0; i<productos.length;i++) {
            nuevoCarrito[i] = productos[i];
        }
        nuevoCarrito[nuevoCarrito.length-1] = p;

        productos = nuevoCarrito;
        // No lo pide el enunciado, pero vamos a mostrar que hemos añadido el producto.
        System.out.println("Hemos añadido al carrito: " + p.getNombre());
    }

    public void eliminarProducto(int posicion) {
        // No lo pide el enunciado, pero vamos a mostrar qué hemos eliminado del carrito. También queremos garantizar que existe el producto.
        if (posicion>=productos.length) {
            System.out.println("No existe ese elemento del carrito.");
        } else {
            // Aquí deberíamos comprobar también que no tenemos un "null" en esa posición. No lo estamos haciendo, pero deberíamos.
            System.out.println("Estamos borrando del carrito el producto: " + productos[posicion].getNombre());
            Producto[] nuevoCarrito = new Producto[productos.length - 1];
            boolean yaHemosSaltadoElBorrado = false;
            for (int i = 0; i < productos.length; i++) {
                if (i == posicion) {
                    yaHemosSaltadoElBorrado = true;
                } else {
                    if (yaHemosSaltadoElBorrado) {
                        nuevoCarrito[i - 1] = productos[i];
                    } else {
                        nuevoCarrito[i] = productos[i];
                    }
                }
            }
            productos = nuevoCarrito;
        }
    }

    // Itera los productos, y devuelve la suma de todos.
    public double devolverTotal() {
        double total = 0;
        for (Producto p:productos) {
            if (p!=null) {
                total+=p.getPrecio();
            }
        }
        return total;
    }
}
