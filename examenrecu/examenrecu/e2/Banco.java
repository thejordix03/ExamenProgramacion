package examenrecu.e2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String id;
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
