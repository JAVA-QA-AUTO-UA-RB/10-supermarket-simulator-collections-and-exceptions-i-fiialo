package main;

public class DuplicateCategoryException extends Exception {
    public DuplicateCategoryException(String message) {
        super(message);
    }
}