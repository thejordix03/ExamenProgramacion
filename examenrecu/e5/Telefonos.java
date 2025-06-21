package examenrecu.e5;

import java.util.*;

public class Telefonos {

    public static void buscarNumero(HashMap<String,ArrayList<String>> agenda) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto Jordi o Pepe:   ");
        String nombre = sc.nextLine();

        if (agenda.containsKey(nombre)) {
            System.out.println("Telefonos del contacto: " + nombre + " son: " + agenda.get(nombre));

        }else{
            System.out.println("El nombre: " +nombre +  " no existe en la lista");
        }
    }
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("123");
        telefonos.add("456");
        agenda.put("Pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("789");
        agenda.put("Jordi", telefonos);
        buscarNumero(agenda);
    }
}
