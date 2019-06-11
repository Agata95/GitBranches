package com.javagda25.GitBranches.example1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String linia;
            int licznik = 0;

            while ((linia = reader.readLine()) != null) {
                licznik++;
            }
            System.out.println(licznik);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
