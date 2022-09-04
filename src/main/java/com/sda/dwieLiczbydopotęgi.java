package com.sda;

import java.util.Scanner;

public class dwieLiczbydopotęgi {

public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in);

        int base = scanner1.nextInt();
        int pow = scanner1.nextInt();

        int result = 1;
        for (int i = 1; i <= pow; i++) {
        result = result * base;
        }

        System.out.println(result);

        for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {

        System.out.println(i + " fizzbuzz");
        } else if (i % 5 == 0) {
            System.out.println(i + " fizz");
        } else if (i % 3 == 0) {
            System.out.println(i + " buz");
        }
            }
        }
        }