package examenrecu.e4;

import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        List<Integer> boletos = Arrays.asList(
                12346, 54326, 99996, 20225, 11116, 66666, 77777, 88888, 99999
        );

        Map<Integer, Integer> contador = new HashMap<>();

        for (int boleto : boletos) {
            int terminacion = boleto % 10; // Último dígito
            contador.put(terminacion, contador.getOrDefault(terminacion, 0) + 1);
        }

        // Encontrar la terminación más común
        int maxRepeticiones = 0; //guardamos
        int terminacionMasRepetida = -1;

        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxRepeticiones) {
                maxRepeticiones = entry.getValue(); // si la terminacion actual se repite mas,la guardmos como nueva
                terminacionMasRepetida = entry.getKey(); //actualizamos
            }
        }

        System.out.println("La terminación más repetida es: " + terminacionMasRepetida +
                " (se repite " + maxRepeticiones + " veces)");
    }
}
