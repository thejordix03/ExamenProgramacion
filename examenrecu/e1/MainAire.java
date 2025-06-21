package examenrecu.e1;

public class MainAire {
    public static void main(String[] args) {
        AireAcondicionado aa = new AireAcondicionado("AC", 20, 35, 15);
        aa.setTemperature(33);
        aa.up();
        System.out.println(aa);
        aa.up();
        System.out.println(aa);
        aa.up();
        System.out.println(aa);
        aa.setTemperature(17);
        aa.down();
        System.out.println(aa);
        aa.down();
        System.out.println(aa);
        aa.down();
        System.out.println(aa);
        aa.setTemperature(40); // Excede máximo
        System.out.println(aa);
    }
}
