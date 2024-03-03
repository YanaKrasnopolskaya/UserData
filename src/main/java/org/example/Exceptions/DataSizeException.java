package org.example.Exceptions;

public class DataSizeException extends ArrayIndexOutOfBoundsException{
    public DataSizeException() {
        super("Данные должны содержать 6 значений (Фамилия Имя Отчество ДатаРождения НомерТелефона Пол)");
    }
}
