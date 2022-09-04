package com.sda;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);


        int liczba = scanner1.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nie - Parzysta");
        }

        String wynik = liczba % 2 == 0 ? "tak" : "nie";
        System.out.println(wynik);

    }
}

