package akeir.infra.exception;

public class GameNotInitializedException extends RuntimeException {

    public GameNotInitializedException(String message)
    {
        super(message);
    }
}
