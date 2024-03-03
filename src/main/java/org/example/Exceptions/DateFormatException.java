package org.example.Exceptions;

public class DateFormatException extends IllegalArgumentException{
    public DateFormatException(){
        super("Некорректно введена дата рождения. Введите дату в формате dd.mm.yyyy");
    }
}
