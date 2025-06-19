package examenrecu.e7;

import java.util.*;
import java.util.stream.Collectors;

public class MainMultiplos5 {
    public static void main(String[] args) {
        // Lista de números como cadenas
        List<String> numerosTexto = Arrays.asList("10", "5", "2", "15", "30", "abc", "25", "3", "8", "-10");

        // Convertimos las cadenas válidas en enteros
        List<Integer> numeros = numerosTexto.stream()
                .filter(s -> s.matches("-?\\d+")) // filtrar solo los que son números enteros válidos
                .map(Integer::parseInt) //los pasamos a enteros
                .collect(Collectors.toList());

        // Contamos cuántos son positivos y divisibles por 5
        long cantidadMultiplos5 = numeros.stream()
                .filter(n -> n > 0 && n % 5 == 0)
                .count();

        // Calculamos el promedio de todos los valores (positivos y negativos)
        OptionalDouble promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Cantidad de positivos múltiplos de 5: " + cantidadMultiplos5);
        if (promedio.isPresent()) {
            System.out.println("Promedio de todos los valores: " + promedio.getAsDouble());
        } else {
            System.out.println("No hay números válidos para calcular el promedio.");
        }
    }
}
