package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

	        double length, width, area, perimeter;
	        String answer;
        do {
            //Input
            System.out.println("Enter Length: ");
            length = scan.nextInt();
            scan.nextLine();

            System.out.printf("Enter Width: ");
            width = scan.nextInt();
            scan.nextLine();

            //Processing
            area = length * width;
            perimeter = (length * 2) + (width * 2);

            //Output
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);

            System.out.println("Enter Yes to continue: ");
            answer = scan.nextLine();

        } while(answer.equals("yes"));
    }
}
