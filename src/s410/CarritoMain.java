package s410;

public class CarritoMain {

    public static void main (String[] args) {
        // Creamos un carrito de la compra
        Carrito compras = new Carrito();


        // Creamos varios productos que podremos añadir
        Producto raton = new Producto("Logitech G502", 35);
        Producto teclado = new Producto("Razer Blackwidow", 150);
        Producto monitor = new Producto ("MSI MAG 244F", 150);
        Producto auriculares = new Producto("Logitech 435", 55);


        // Añadirmos los productos
        System.out.println("Añadiendo el ratón: " + raton.getNombre());
        compras.anhadirProducto(raton);
        System.out.println("Añadiendo el teclado: " + teclado.getNombre());
        compras.anhadirProducto(teclado);
        System.out.println("Añadiendo el monitor: " + monitor.getNombre());
        compras.anhadirProducto(monitor);
        System.out.println("Añadiendo los auriculares: " + auriculares.getNombre());
        compras.anhadirProducto(auriculares);


        System.out.println("El coste total es " + compras.devolverTotal());

        System.out.println("Es demasiado. Eliminamos el último produto.");

        // Finalmente, eliminamos uno de los productos
        compras.eliminarProducto(3);
        System.out.println("El coste total ahora es " + compras.devolverTotal());


    }
}
