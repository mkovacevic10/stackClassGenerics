/**
 * Test class for the Stack.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Stack<Integer> numberStack = new Stack<>(5);
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);
            System.out.println("Number stack: " + numberStack.list()); // Output: 1;2;3
            System.out.println("Peek: " + numberStack.peek()); // Output: 3
            numberStack.pop();
            System.out.println("After pop: " + numberStack.list()); // Output: 1;2

            Stack<String> textStack = new Stack<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text stack: " + textStack.list()); // Output: Hello;World
            textStack.pop();
            System.out.println("After pop: " + textStack.list()); // Output: Hello
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
    }
}