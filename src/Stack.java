// Stack.java

/**
 * A generic stack class that uses an array to store elements.
 * @param <T> The type of elements stored in the stack.
 */
public class Stack<T> {
    private T[] elements;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public Stack() {
        this(10); // Default capacity
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element The element to be pushed.
     * @throws StackFullException if the stack is full.
     */
    public void push(T element) throws StackFullException {
        if (size == capacity) {
            throw new StackFullException("Stack is full");
        }
        elements[size++] = element;
    }

    /**
     * Pops an element from the stack.
     *
     * @return The element that was popped.
     * @throws StackEmptyException if the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        T element = elements[--size];
        elements[size] = null; // Clear the reference for garbage collection
        return element;
    }

    /**
     * Peeks at the top element of the stack.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException if the stack is empty.
     */
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return elements[size - 1];
    }

    /**
     * Lists all elements in the stack as a semicolon-separated string.
     *
     * @return A string containing all elements in the stack separated by semicolons.
     */
    public String list() {
        if (size == 0) {
            return "";
        }

        String result = "";
        for (int i = 0; i < size - 1; i++) {
            result += elements[i] + ";";
        }
        result += elements[size - 1];
        return result;
    }

}

