package examenrecu.e3;


public class MainEmpleados {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Jordi");
        Directivo dir = new Directivo("Victor");
        Operario op = new Operario("Cristina");
        Oficial of = new Oficial("Juan");
        Tecnico tec = new Tecnico("Daniel");

        System.out.println(emp);
        System.out.println(dir);
        System.out.println(op);
        System.out.println(of);
        System.out.println(tec);
    }
}
