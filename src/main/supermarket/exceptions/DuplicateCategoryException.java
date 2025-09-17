package main.supermarket.exceptions;

public class DuplicateCategoryException extends Exception {
    public DuplicateCategoryException(String message) {
        super(message);
    }
}