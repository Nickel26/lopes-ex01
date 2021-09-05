import java.util.Scanner;

public class solution01 {

    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    public static void main(String args[]){
        //Ask user for name
        //Store name input
        //Print out name with output
        System.out.print("What is your name?");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }

}
                                   