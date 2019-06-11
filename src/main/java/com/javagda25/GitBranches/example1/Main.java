package com.javagda25.GitBranches.example1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true))) {
            printWriter.println("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

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
