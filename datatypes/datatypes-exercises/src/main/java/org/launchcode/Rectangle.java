package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What is the length of your Rectangle? In inches.");

        int length = input.nextInt();
        System.out.println("Your rectangle is " + length + " inches long.");

        Scanner input2;
        input2 = new Scanner(System.in);
        System.out.println("What is the width of your Rectangle? In inches.");

        int width = input2.nextInt();
        System.out.println("Your rectangle is " + length + " inches long, and " + width + " inches wide, meaning your rectangle has an area of " + (length * width));

        input.close();
    }
}
