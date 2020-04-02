package Exp;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Нельзя преобразовать элемент [" + i + "] + [" + j + "]в число");
    }

    public MyArrayDataException(String message) {
        super(message);
    }
}
