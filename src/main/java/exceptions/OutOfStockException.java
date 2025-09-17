package main.java.exceptions;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}