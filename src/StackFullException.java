/**
 * Exception thrown when attempting to push onto a full stack.
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}