package org.example.userData;

import org.example.Exceptions.DataSizeException;
import org.example.Exceptions.DateFormatException;
import org.example.Exceptions.GenderFormatException;
import org.example.Exceptions.UserNumberFormatException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class UserDataParse {
    public String[] parseData(UserDataable input) {
        String[] data = input.dataInput().split(" ");

        if (data.length != 6) {
            throw new DataSizeException();
        }

        try {
            Date birthday = new SimpleDateFormat("dd.MM.yyyy").parse(data[3]);
        } catch (ParseException e) {
            throw new DateFormatException();
        }

        if (data[4].length() != 11){
            throw new UserNumberFormatException();
        }

        if (!data[5].equalsIgnoreCase("м") && !data[5].equalsIgnoreCase("ж")) {
            throw new GenderFormatException();
        }
        return data;
    }
}
