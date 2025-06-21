package examenrecu.e6;

import java.util.*;

public class MainFelipe {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();

        tareas.add(new Tarea("Hacer deberes", 5, 60));
        tareas.add(new Tarea("Leer cómic", 2, 30));
        tareas.add(new Tarea("Limpiar habitación", 4, 20));
        tareas.add(new Tarea("Ver dibujos", 2, 60));
        tareas.add(new Tarea("Estudiar Java", 5, 30));
        tareas.add(new Tarea("Pasear perro", 3, 15));

        Collections.sort(tareas);

        System.out.println("Tareas ordenadas por prioridad y duración:");
        for (Tarea t : tareas) {
            System.out.println(" - " + t);
        }
    }
}
