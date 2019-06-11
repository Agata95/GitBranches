package com.javagda25.GitBranches.example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {
    public void odczyt(){
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String linia;
            int licznik = 0;

            while ((linia = reader.readLine()) != null) {
                licznik++;
            }
            System.out.println("Plik zawiera " + licznik + " linii.");

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
