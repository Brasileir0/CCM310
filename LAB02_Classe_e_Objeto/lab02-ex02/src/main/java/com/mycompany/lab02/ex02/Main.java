package com.mycompany.lab02.ex02;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i <= 50) {
                System.out.println(i);
            } else {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
