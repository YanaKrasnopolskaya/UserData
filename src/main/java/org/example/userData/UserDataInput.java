package org.example.userData;

import org.example.userData.UserDataable;

import java.util.Scanner;

public class UserDataInput implements UserDataable {
    @Override
    public String dataInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(без пробелов и символов) пол");
        return scanner.nextLine();
    }
}
