package examenrecu.e1;

public class AireAcondicionado {
    private String nombre;
    private int tempActual;
    private int tempMaxima;
    private int tempMinima;

    public AireAcondicionado(String nombre, int tempActual, int tempMaxima, int tempMinima) {
        this.nombre = nombre;
        this.tempMaxima = tempMaxima;
        this.tempMinima = tempMinima;
        // Si la temperatura inicial no está en rango, la ajustamos
        if (tempActual > tempMaxima) {
            this.tempActual = tempMaxima;
        } else if (tempActual < tempMinima) {
            this.tempActual = tempMinima;
        } else {
            this.tempActual = tempActual;
        }
    }

    public void setTemperature(int temp) {
        if (temp > tempMaxima) {
            this.tempActual = tempMaxima;
        } else if (temp < tempMinima) {
            this.tempActual = tempMinima;
        } else {
            this.tempActual = temp;
        }
    }

    public void up() {
        if (tempActual < tempMaxima) {
            tempActual++;
        }
    }

    public void down() {
        if (tempActual > tempMinima) {
            tempActual--;
        }
    }

    @Override
    public String toString() {
        return nombre + "   Temperature: " + tempActual;
    }
}
