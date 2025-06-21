package examenrecu.e8;

import java.util.Stack;

public class Parentesis {
    public static boolean estaBalanceado(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char c : cadena.toCharArray()) {
            switch (c) {
                case '(': case '[': case '{':
                    pila.push(c); // Abrimos
                    break;
                case ')':
                    if (pila.isEmpty() || pila.pop() != '(') return false;
                    break;
                case ']':
                    if (pila.isEmpty() || pila.pop() != '[') return false;
                    break;
                case '}':
                    if (pila.isEmpty() || pila.pop() != '{') return false;
                    break;
                default:
                    // Ignorar otros caracteres
                    break;
            }
        }

        return pila.isEmpty(); // Si no hay nada pendiente, está balanceado
    }
        public static void main(String[] args) {
            String[] pruebas = {
                    "([{}])",     // true
                    "(]",         // false
                    "{[()]}",     // true

            };

            for (String prueba : pruebas) {
                System.out.println("Cadena: " + prueba + " => " + (Parentesis.estaBalanceado(prueba) ? "Correcta" : "Incorrecta"));
            }
        }

}
