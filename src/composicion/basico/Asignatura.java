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


    public void mostrarResumen() {
        System.out.println("La asignatura " +
                nombre + " la da " + profesor.getNombre()
        + " y tiene " + alumnos.length + " alumnos.");
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevo) {
        this.profesor = nuevo;
    }

    // Elimina a los alumnos con el id que se le pasa. Devuelve verdadero si lo ha eliminado.
    public boolean eliminarAlumno(Alumno alumno) {
        return true;

    }


    // Añade al alumno si no está ya en el curso - comprobamos si es exactamente el mismo objeto para decidir si es el mismo alumno.
    public boolean anhadirAlumno(Alumno alumnoNuevo) {
        for (Alumno alumno:alumnos)  {
            if (alumno == alumnoNuevo) {
                System.out.println("El alumno ya está en el curso. No se puede añadir.");
                return false;
            }
        }
        // Si llegamos a este punto, es que no tenemos a ningún alumno con el mismo ID que el alumno de entrada.
        // Creamos un nuevo array de alumnos de tamaño 1 más grande que el original, copiamos el original en este nuevo array,
        // y apuntamos el original al nuevl.

        Alumno [] nuevaLista = new Alumno[alumnos.length+1];
        // Recorremos todos los elementos del array original...
        for (int i=0; i<alumnos.length; i++) {
            // ... y los vamos copiando uno a uno en el array nuevo.
            nuevaLista[i] = alumnos[i];
        }
        // Y en la última posición del array nuevo, copiamos el alumno que nos piden añadir. Como ejemplo:
        // Si el array original alumnos tiene 3 alumnos (posiciones 0, 1, 2)...
        // ... hemos creado un array "nuevaLista" con 3+1 posiciones, o sea, 0, 1, 2 y 3...
        // ... hemos recorrido el array original (con i=0, =1 e =2) y hemos copiado el alumno en el nuevo...
        // ... por tanto, nuevaLista tiene las posiciones 0, 1 y 2 con los alumnos originales. Hemos dejado
        // la última posición, la 3, para poner el nuevo alumno que nos han pasado para añadir.
        nuevaLista[nuevaLista.length-1] = alumnoNuevo;

        return true;
    }

    // Añade al alumno si no está ya en el curso - por id.
    public boolean anhadirAlumnoPorId(Alumno alumnoNuevo) {
        for (Alumno alumno:alumnos)  {
            if (alumno.getId().equals(alumnoNuevo.getId())) {
                System.out.println("El alumno ya está en el curso. No se puede añadir.");
                return false;
            }
        }
        // Si llegamos a este punto, es que no tenemos a ningún alumno con el mismo ID que el alumno de entrada.
        // Creamos un nuevo array de alumnos de tamaño 1 más grande que el original, copiamos el original en este nuevo array,
        // y apuntamos el original al nuevl.

        Alumno [] nuevaLista = new Alumno[alumnos.length+1];
        // Recorremos todos los elementos del array original...
        for (int i=0; i<alumnos.length; i++) {
            // ... y los vamos copiando uno a uno en el array nuevo.
            nuevaLista[i] = alumnos[i];
        }
        // Y en la última posición del array nuevo, copiamos el alumno que nos piden añadir. Como ejemplo:
        // Si el array original alumnos tiene 3 alumnos (posiciones 0, 1, 2)...
        // ... hemos creado un array "nuevaLista" con 3+1 posiciones, o sea, 0, 1, 2 y 3...
        // ... hemos recorrido el array original (con i=0, =1 e =2) y hemos copiado el alumno en el nuevo...
        // ... por tanto, nuevaLista tiene las posiciones 0, 1 y 2 con los alumnos originales. Hemos dejado
        // la última posición, la 3, para poner el nuevo alumno que nos han pasado para añadir.
        nuevaLista[nuevaLista.length-1] = alumnoNuevo;

        // Reemplazamos nuestro array original por el nuevo que hemos creado, que incluye al alumnno añadido. 
        alumnos = nuevaLista;
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
