package s21;

public class CuentaBancariaMain {
    public static void main(String[] args) {

        //Creamos una cuenta nueva
        String nombre = "Pepe";
        double saldo = -3;
        System.out.println("Creando cuenta bancaria para " + nombre + " con un saldo negativo de " + saldo);

        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldo);


        System.out.println("Intentamos retirar dinero; como está en cero, no nos deja. ");

        cuenta.retirar(100);

        double cantidadAIngresar = 500;
        System.out.println("Hacemos un ingreso de 500");
        cuenta.ingresar(cantidadAIngresar);

        System.out.println("Mostramos el estado de la cuenta");

        cuenta.mostrarEstado();


        System.out.println("Intentamos retirar 100, y mostramos el estado");
        cuenta.retirar(100);
        cuenta.mostrarEstado();


    }
}
