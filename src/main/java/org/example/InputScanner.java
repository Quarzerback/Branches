package org.example;

import java.util.Scanner;

public class InputScanner {
    private Scanner scanner;

    public InputScanner() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

}
