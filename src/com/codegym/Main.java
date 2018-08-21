package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;
        int[] mark;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter size: ");
            size = input.nextInt();
            if (size > 7) {
                System.out.println("Out of rank.");
            }
        } while (size > 7);

        mark = new int[size];
        int i = 0;
        while (i < mark.length) {
            System.out.println("Enter mark: ");
            mark[i] = input.nextInt();
            i++;
        }

        System.out.print("Mark List: ");
        for (int j = 0; j < mark.length; j++) {
            System.out.print(mark[j] + " ");
        }

        int count = 0;
        for (int j = 0; j < mark.length; j++) {
            if (mark[j] >= 5) {
                count++;
            }
        }

        System.out.println("Number of students passing the exam: " + count);
    }
}
