package examenrecu.e2;

public class Prestamo {
    private String codigo;
    private double cantidad;
    private Sucursal sucursal;
    private Cliente cliente;

    public Prestamo(String codigo, double cantidad, Sucursal sucursal, Cliente cliente) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return codigo + " " + cantidad;
    }
}
