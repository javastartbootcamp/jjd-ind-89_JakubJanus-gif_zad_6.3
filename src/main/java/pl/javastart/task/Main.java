package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int Max_size = 100;

        System.out.print("Podaj liczbę wierszy (max 100): ");
        int rows = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn (max 100): ");
        int cols = scanner.nextInt();

        if (rows < 1 || rows > Max_size || cols < 1 || cols > Max_size) {
            System.out.println("Nieprawidłowe wymiary. Wprowadź liczby z przedziału 1-100.");
        }
        int[][] table = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = i * j;
            }
        }

        System.out.print("Tablica mnożenia:\n");
        int rowWidth = cols * 6 + cols + 1;
        printHorizontalLine(rowWidth);

        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.printf("%6d |", table[i][j]);
            }
            System.out.println();
            printHorizontalLine(rowWidth);
        }
        scanner.close();
    }

    private static void printHorizontalLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}