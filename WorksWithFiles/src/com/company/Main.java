package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        int N = 1119;
        Scanner scanner = new Scanner(new File("input.txt"));
        int sum = 0;
        int i = 0;
        while (i < N) {
            sum = sum + scanner.nextInt();
            i = i + 1;
        }
        System.out.println(sum / 1119.0);
    }
}
