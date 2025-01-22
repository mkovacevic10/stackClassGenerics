/**
 * Exception thrown when attempting to push onto a full stack.
 * @author Maksym Kovacevic
 * @version 21-01-2025
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}