package Assignment.IPL;

public class TeamNotExistException extends Exception {
    private static final long serialVersionUID = 1L;

    public TeamNotExistException(String message) {
        super(message);
    }
}