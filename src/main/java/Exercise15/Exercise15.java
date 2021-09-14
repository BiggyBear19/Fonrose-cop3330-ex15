package Exercise15;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Bernard Fonrose
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        Scanner validation = new Scanner(System.in);

        System.out.print("Please enter the password: ");

        String entry = validation.nextLine();

        String pass;

        pass = (entry.compareTo("Ligma")) == 0 ? "Welcome" : "I don't know you";

        System.out.printf("%s", pass);
    }
}
