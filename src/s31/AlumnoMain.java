package s31;

import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("a", 5);
        alumnos[1] = new Alumno("b", 6);
        alumnos[2] = new Alumno("c", 7);
        alumnos[3] = new Alumno("d", 1);
        alumnos[4] = new Alumno("e", 3);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qué nombre quieres buscar?");
        String nombre = sc.nextLine();

        Alumno encontrado = null;
        for (int i = 0; i<alumnos.length; i++) {
            if (alumnos[i].getNombre().equals(nombre)) {
                encontrado = alumnos[i];
                break;
            }
        }
        if (encontrado==null) {
            System.out.println("No encontrado.");
        } else {
            System.out.println("Encontrado. Su nota es: " + encontrado.getNota());
        }

    }
}
