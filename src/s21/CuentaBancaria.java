package s21;

public class CuentaBancaria {
    // Creamos ambas variables
    private String nombre;
    private double saldo;

    public CuentaBancaria(String nombre, double saldo) {
        this.nombre = nombre;
        // No se permiten cuentas con saldo negativo, así que en ese caso, advertimos y lo ponemos a 0
        if (saldo<0) {
            System.out.println("No se permiten saldos negativos. Iniciándolo a 0.");
            saldo = 0;
        } else { // si el saldo inicial es positivos, lo guardamos en el objeto.
            this.saldo = saldo;
        }
    }

    // Cuando ingresamos dinero, tenemos que ingresar una cantidad positiva.
    public void ingresar (double cantidad) {
        if (cantidad<0) {
            System.out.println("No se pueden ingresar cantidades negativas");
        } else {
            saldo += cantidad;
        }
    }

    // Resta dinero de la cuenta, pero sólo si hay suficiente.
    public void retirar (double cantidad) {
        // si queremos retirar una cantidad negativa - ingresar - no dejamos
        if (cantidad<0) {
            System.out.println("No se pueden retirar cantidades negativas: " + cantidad);
        } else {
            // si queremos retirar más dinero del que hay en la cuenta no dejamos; en caso contrario (else) sí dejamos
            if (cantidad > saldo) {
                System.out.println("No tienes tanto dinero, tienes " + saldo);
            } else {
                saldo -= cantidad;
            }
        }
    }

    // Esta función muestra el estado; por tanto, no devuelve nada, sólo imprime
    public void mostrarEstado() {
        System.out.println("La cuenta de " + nombre + " tiene: " + saldo);
    }

}
