package com.pluralsight;

import java.util.*;

public class Library
{
    //static scanner
    static Scanner scanner = new Scanner(System.in);

    //book array
    static Book[] books = new Book[20];

    public static void main(String[] args)
    {
        System.out.println("Welcome to Pluralsight Library");



        books[0] = new Book(1, "123-1","Ender's Game", false, "");
        books[1] = "Harry Potter";
        books[2] = "Secret Garden";
        books[3] = "Department 19";
        books[4] = "Harry Potter";
        books[5] = "not secret garden";
        books[6] = "not so secret garden";
        books[7] = "not very secret garden";
        books[8] = "not really secret garden";
        books[9] = "public garden";
        books[10] = "trashed garden";
        books[11] = "good garden";
        books[12] = "flower garden";
        books[13] = "grass garden";
        books[14] = "art garden";
        books[15] = "old garden";
        books[16] = "new garden";
        books[17] = "red garden";
        books[18] = "blue garden";
        books[19] = "secret's garden";





        //variable to interact with home screen
        int mainMenuCommand;

                //do while loop to accept users inputs while inside library class
                do {
                    // Show all command options
                    System.out.println("1) Show Available Books");
                    System.out.println("2) Show Checkout Books");
                    System.out.println("0) Exit");

                    // Ask the user for a command(Choose an option)
                    System.out.print("Choose an option: ");
                    mainMenuCommand = scanner.nextInt();

                    switch(mainMenuCommand){
                        case 1:
                            checkOut();
                            break;
                        case 2:
                            checkIn();
                            break;
                        case 0:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Command not found! Please try again");
                    }

                } while(mainMenuCommand != 0);

    }

            public static void checkOut()
            {
                /*
                displays currently checked in books
                allow user to check out one of the books
                make user enter name whilst checking out a book
                prompt to select book or go back to home screen
                 */

            }

            public static void checkIn()
            {
                /*
                displays checkout out books along with their id,idbn,and title
                allow user to check in book

                 */
            }



}







