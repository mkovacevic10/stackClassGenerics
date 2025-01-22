/**
 * Exception thrown when attempting to pop or peek from an empty stack.
 * @author Maksym Kovacevic
 * @version 21-01-2025
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}