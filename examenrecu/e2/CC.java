package examenrecu.e2;

import java.util.ArrayList;
import java.util.List;

public class CC {
    private String numero;
    private Sucursal sucursal;
    private List<Cliente> clientes;
    private List<Domiciliacion> domiciliaciones;

    public CC(String numero, Sucursal sucursal) {
        this.numero = numero;
        this.sucursal = sucursal;
        this.clientes = new ArrayList<>();
        this.domiciliaciones = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void addDomiciliacion(Domiciliacion d) {
        domiciliaciones.add(d);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    @Override
    public String toString() {
        return numero;
    }
}
