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
