package by.milavitsky.homework.task2.exception;

public class IncorrectValueException extends Exception {

    public IncorrectValueException(){}

    public IncorrectValueException(String message){
        super(message);
    }

    public IncorrectValueException(String message, Throwable cause){
        super(message, cause);
    }

    public IncorrectValueException(Throwable cause){
        super(cause);
    }
}
