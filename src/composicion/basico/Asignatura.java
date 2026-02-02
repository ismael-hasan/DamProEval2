package composicion.basico;

public class Asignatura {

    private String nombre;
    private Profesor profesor;
    private Alumno[] alumnos;


    public Asignatura(String nombre, Profesor profesor, Alumno[] alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = new Alumno[alumnos.length];
        for (int i=0; i<this.alumnos.length; i++) {
            this.alumnos[i] = alumnos[i];
        }
    }

    // Elimina a los alumnos con el id que se le pasa. Devuelve verdadero si lo ha eliminado.
    public boolean eliminarAlumno(Alumno alumno) {
        return true;

    }

    // Añade al alumno si no está ya en el curso - por id.
    public boolean anhadirAlumno(Alumno alumno) {
        return true;
    }

    public int getNumeroDeAlumnos() {
        return alumnos.length;
    }

    public String getNombre() {
        return nombre;
    }

    // Devuelve el nombre de todos los alumnos
    public String[] obtenerListadoDeAlumnos() {
        return null;
    }

}
