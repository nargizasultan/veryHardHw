package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("Nargiza.txt")) {
            for (int i = 0; i < convertToCharLowerCase().length - 1; i++) {
                fileWriter.write(convertToCharUpperCase()[i] + " ");
                fileWriter.write(convertToCharLowerCase()[i] + "\n");


            }
            for (int i = 0; i < 10; i++) {
                fileWriter.write(i + System.lineSeparator());

            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fileReader = new FileReader("Nargiza.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                for (int i = 1; i < convertToCharUpperCase().length + 10; i++) {
                    System.out.println(i + ":" + scanner.nextLine());


                }


            }

        } catch (IOException e) {
            e.getMessage();
        }


    }

    public static StringBuilder getUpperAlphabets() {
        StringBuilder stringBuilder = new StringBuilder();
        int beginningUpperLetters = 65;

        for (int i = beginningUpperLetters; i <= beginningUpperLetters + 25; i++) {
            stringBuilder.append((char) i);


        }
        return stringBuilder;

    }

    public static StringBuilder getLowerAlphabets() {
        StringBuilder stringBuilder = new StringBuilder();
        int beginningLowerLetters = 97;

        for (int i = beginningLowerLetters; i <= beginningLowerLetters + 25; i++) {
            stringBuilder.append((char) i);


        }
        return stringBuilder;
    }

    public static char[] convertToCharLowerCase() {

        char[] chars = new char[getLowerAlphabets().length()];
        getLowerAlphabets().getChars(0, getLowerAlphabets().length(), chars, 0);

        return chars;
    }

    public static char[] convertToCharUpperCase() {

        char[] chars = new char[getUpperAlphabets().length()];
        getUpperAlphabets().getChars(0, getUpperAlphabets().length(), chars, 0);

        return chars;
    }

}
