package org.example.Exceptions;

public class GenderFormatException extends IllegalArgumentException{
    public GenderFormatException(){
        super("Неверный формат ввода. Введите 'ж' для женского пола и 'м' для мужского пола.");
    }
}
