package main;

public class NoSuchProductException extends Exception {
    public NoSuchProductException(String message) {
        super(message);
    }
}