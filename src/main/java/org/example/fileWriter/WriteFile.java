package org.example.fileWriter;
import org.example.userData.UserDataParse;
import org.example.userData.UserDataable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile implements FileWriteable{
    @Override
    public void write(UserDataable input) {
        UserDataParse userDataParse = new UserDataParse();
        String[] data =  userDataParse.parseData(input);
        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        String birthday = data[3];
        String phoneNumber = data[4];
        String gender = data[5];
        String fileName = lastName + ".txt";
        try (FileWriter writer = new FileWriter(new File(fileName), true)) {
            writer.write(lastName + " " + firstName + " " + patronymic + " " + birthday + " " + phoneNumber + " " + gender + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
