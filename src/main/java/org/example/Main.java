package org.example;

import org.example.fileWriter.FileWriteable;
import org.example.fileWriter.WriteFile;
import org.example.userData.UserDataInput;
import org.example.userData.UserDataParse;
import org.example.userData.UserDataable;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UserDataable userData = new UserDataInput();
        FileWriteable fileWrite = new WriteFile();
        fileWrite.write(userData);
    }
}