package examenrecu.e9;

import java.util.*;

public class MainPersona {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Laura", "Martínez", 2001));
        personas.add(new Person("Carlos", "Ruiz", 1999));
        personas.add(new Person("Ana", "Sánchez", 2003));

        System.out.println("Personas:");
        personas.forEach(System.out::println);

        OptionalDouble media = personas.stream()
                .mapToInt(Person::getBirthYear)
                .average();

        if (media.isPresent()) {
            System.out.println("Media de nacimiento: " + media.getAsDouble());
        } else {
            System.out.println("No se puede calcular la media.");
        }
    }
}
