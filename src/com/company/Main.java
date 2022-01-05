package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i < 2) {
                continue;
            } else if (i == 2) {
                System.out.println(i);
            } else {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}