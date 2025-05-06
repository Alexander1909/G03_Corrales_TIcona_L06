package Actividad1;
public class Test {
    public static void main(String[] args) {
        try {
            // Pila de enteros
            Stack<Integer> pilaEnteros = new StackArray<>(5);
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);
            System.out.println("Pila de enteros: " + pilaEnteros);
            System.out.println("Cima: " + pilaEnteros.top());
            System.out.println("Eliminando: " + pilaEnteros.pop());
            System.out.println("Pila actual: " + pilaEnteros);
            // Pila de cadenas
            Stack<String> pilaCadenas = new StackArray<>(3);
            pilaCadenas.push("Hola");
            pilaCadenas.push("Mundo");
            System.out.println("\nPila de cadenas: " + pilaCadenas);
            System.out.println("Cima: " + pilaCadenas.top());
            pilaCadenas.pop();
            System.out.println("Después de pop: " + pilaCadenas);
            // Pila vacía
            Stack<Double> pilaVacia = new StackArray<>(2);
            System.out.println("\n¿Está vacía la pila de doubles?: " + pilaVacia.isEmpty());
            pilaVacia.push(3.14);
            pilaVacia.pop();
            System.out.println("¿Está vacía después de pop?: " + pilaVacia.isEmpty());

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}