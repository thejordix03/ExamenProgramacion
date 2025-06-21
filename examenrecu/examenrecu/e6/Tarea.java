package examenrecu.e6;

public class Tarea implements Comparable<Tarea> {
    private String nombre;
    private int prioridad;
    private int duracion;

    public Tarea(String nombre, int prioridad, int duracion) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public int compareTo(Tarea otra) {
        // Ordenamos
        if (this.prioridad != otra.prioridad) {
            return Integer.compare(otra.prioridad, this.prioridad);
        } else {

            return Integer.compare(this.duracion, otra.duracion);
        }
    }
    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ", Duración: " + duracion + " min)";
    }
}
