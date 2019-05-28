package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean isMagic = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите кол-во строк квадрата: ");
        int numberOfLine = Integer.parseInt(br.readLine());
        int[][] square = new int[numberOfLine][numberOfLine];
        int[] row = new int[numberOfLine];
        int[] column = new int[numberOfLine];
        int[] diagonal = new int[2];
        for (int i = 0; i < numberOfLine; i++) {
            System.out.println("Введите числа " + (i + 1) + " строки");
            for (int j = 0; j < numberOfLine; j++) {
                square[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Ваш квадрат: ");
        for (int i = 0; i < numberOfLine; i++) {
            System.out.print("[");
            for (int j = 0; j < numberOfLine; j++) {
                System.out.print(" " + square[i][j] + " ");
            }
            System.out.println("]");
        }
        for (int i = 0; i < numberOfLine; i++) {
            diagonal[0] += square[i][i];
            diagonal[1] += square[numberOfLine - i - 1][i];
            for (int j = 0; j < numberOfLine; j++) {
                row[i] += square[i][j];
                column[i] += square[j][i];
            }
        }
        for (int i = 0; i < numberOfLine - 1; i++) {
            if (!(row[i] == row[i + 1] && column[i] == column[i + 1] && diagonal[0] == diagonal[1] &&
                    row[i] == column[i] && column[i] == diagonal[i])) {
                isMagic = false;
            } else {
                isMagic = true;
            }
        }
        System.out.println(isMagic ? "Является магическим." : "Не является магическим");
    }
}