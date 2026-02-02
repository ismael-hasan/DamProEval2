package s31;

public class Alumno {

    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarDatos() {
       System.out.println("El alumno  " + nombre +
               " tiene un " + nota);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
}
