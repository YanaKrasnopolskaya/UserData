package org.example.Exceptions;

public class UserNumberFormatException extends NumberFormatException {
    public UserNumberFormatException(){
        super("Некорректно введен номер телефона. Введите 11 цифр без символов и пробелов");
    }
}
