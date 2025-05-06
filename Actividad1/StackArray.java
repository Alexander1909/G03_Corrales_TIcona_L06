package Actividad1;

class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    @SuppressWarnings("unchecked")
    public StackArray(int tamaño) {
        array = (E[]) new Object[tamaño];
        tope = -1;
    }

    public void push(E elemento) {
        if (isFull()) {
            System.out.println("La pila está llena.");
            return;
        }
        tope++;
        array[tope] = elemento;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía.");
        }
        E elemento = array[tope];
        tope--;
        return elemento;
    }
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía.");
        }
        return array[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == array.length - 1;
    }
    