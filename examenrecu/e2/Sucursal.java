package examenrecu.e2;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String id;
    private String nombre;
    private Banco banco;
    private List<CC> cuentas;
    private List<Prestamo> prestamos;

    public Sucursal(String id, String nombre, Banco banco) {
        this.id = id;
        this.nombre = nombre;
        this.banco = banco;
        this.cuentas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void addCC(CC cc) {
        cuentas.add(cc);
    }

    public void addPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    public List<CC> getCC() {
        return cuentas;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
