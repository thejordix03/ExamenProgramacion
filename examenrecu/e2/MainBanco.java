package examenrecu.e2;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("123", "BBVA");

        Sucursal sucursalCastellon = new Sucursal("456", "Castellón", banco);
        Sucursal sucursalValencia = new Sucursal("838", "Valencia", banco);
        banco.addSucursal(sucursalValencia);
        banco.addSucursal(sucursalCastellon);

        Cliente cliente = new Cliente("789G", "Pepe");

        CC cuentaCorriente = new CC("999", sucursalCastellon);
        cuentaCorriente.addCliente(cliente);
        cliente.addCC(cuentaCorriente);
        sucursalCastellon.addCC(cuentaCorriente);

        Prestamo prestamo = new Prestamo("888", 1000, sucursalCastellon, cliente);
        cliente.addPrestamo(prestamo);
        sucursalCastellon.addPrestamo(prestamo);

        Domiciliacion domiciliacion = new Domiciliacion("93949", 100, "Luz", cuentaCorriente);
        cuentaCorriente.addDomiciliacion(domiciliacion);

        System.out.println(banco);
        for (Sucursal sucursal : banco.getSucursales()) {
            System.out.println("\t" + sucursal);
            for (CC cuenta : sucursal.getCC()) {
                System.out.println("\t\tCC: " + cuenta);
                for (Cliente c : cuenta.getClientes()) {
                    System.out.println("\t\t\tCliente " + c);
                    for (Prestamo p : c.getPrestamos()) {
                        System.out.println("\t\t\t\tPréstamo " + p);
                    }
                }
                for (Domiciliacion d : cuenta.getDomiciliaciones()) {
                    System.out.println("\t\t\t\tDomiciliación " + d);
                }
            }
        }
    }
}
