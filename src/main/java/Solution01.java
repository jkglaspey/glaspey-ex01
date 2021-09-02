/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

import java.util.Scanner;

public class Solution01 {
    /*
        Write an application that prompts for your name and prints a greeting using that name
            print "enter your name"
            's' = String read from user
            print "your name is 's'"
    */

    public static void main(String[] args) {

        //declare variables
        Scanner in = new Scanner(System.in);
        String s;

        System.out.printf("What is your name? ");
        s = in.nextLine();
        System.out.printf("Hello, %s, nice to meet you!",s);
    }
}