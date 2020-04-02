package Exp;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("В метод подаётся не массив размером 4х4");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
