package examenrecu.e2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private List<CC> cuentas;
    private List<Prestamo> prestamos;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void addCC(CC cuenta) {
        cuentas.add(cuenta);
    }

    public void addPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
