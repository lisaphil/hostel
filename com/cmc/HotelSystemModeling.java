package com.cmc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelSystemModeling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int m = in.nextInt();
            int k = in.nextInt();
            new HotelSystem(k, m);
            System.out.println(k);
            System.out.println(m);
        } catch (InputMismatchException e) {
        }

    }
}
