package examenrecu.e2;

public class Domiciliacion {
    private String codigo;
    private double importe;
    private String concepto;
    private CC cuenta;

    public Domiciliacion(String codigo, double importe, String concepto, CC cuenta) {
        this.codigo = codigo;
        this.importe = importe;
        this.concepto = concepto;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Recibo:" + codigo + " " + concepto + " " + importe;
    }
}

