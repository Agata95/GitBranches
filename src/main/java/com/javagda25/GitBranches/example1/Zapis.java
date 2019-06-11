package com.javagda25.GitBranches.example1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {
    public void zapis() {
        // data.txt - Hello World! - w trybie append
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true))) {
            printWriter.println("Hello World!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
