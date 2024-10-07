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


        //all books in library
        books[0] = new Book(1, "123-17","Ender's Game", false, "");
        books[1] = new Book(2, "123-28", "Harry Potter", false,"");
        books[2] = new Book(3,"123-39", "Secret Garden", false, "");
        books[3] = new Book(4,"123-410", "Department 19", false, "");
        books[4] = new Book(5,"123-511", "Harry Potter", false, "");
        books[5] = new Book(6,"123-612", "not secret garden", false, "");
        books[6] = new Book(7,"123-713", "not so secret garden", false, "");
        books[7] = new Book(8,"123-814", "not very secret garden", false, "");
        books[8] = new Book(9,"123-915", "not really secret garden", false, "");
        books[9] = new Book(10,"124-07", "public garden", false, "");
        books[10] = new Book(11,"124-18", "trashed garden", false, "");
        books[11] = new Book(12,"124-29", "good garden", false, "");
        books[12] = new Book(13,"124-310", "flower garden", false, "");
        books[13] = new Book(14,"124-411", "grass garden", false, "");
        books[14] = new Book(15,"124-512", "art garden", false, "");
        books[15] = new Book(16,"124-613", "old garden", false, "");
        books[16] = new Book(17,"124-714", "new garden", false, "");
        books[17] = new Book(18,"124-815", "red garden", false, "");
        books[18] = new Book(19,"124-916", "blue garden", false, "");
        books[19] = new Book(20,"125-08", "secret's garden", false, "");





        //variable to interact with home screen
        int mainMenuCommand;

                //do while loop to accept users inputs while inside library class
                do {
                    // Show all command options
                    System.out.println("1) Show Available Books");
                    System.out.println("2) Show Checked out Books");
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

                System.out.println("\nAvailable Books:");
                boolean availableBooksExist = false;

                // display the available books
                for (Book book : books)
                {
                    if (book != null && !book.isCheckedOut())
                    {
                        availableBooksExist = true;
                        System.out.println(book.getId() + ") " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
                    }
                }

                if (!availableBooksExist)
                {
                    System.out.println("No available books to check out.");
                    return;
                }

                // Prompt the user to select a book or go back to the main menu
                System.out.print("Enter the ID of the book you want to check out (or 0 to return to the main menu): ");
                int bookId = scanner.nextInt();
                scanner.nextLine(); // fakeout

                if (bookId == 0)
                {
                    return; // Go back to the main menu
                }

                Book selectedBook = findBookById(bookId);

                if (selectedBook != null && !selectedBook.isCheckedOut())
                {
                    System.out.print("Enter your name to check out the book: ");
                    String userName = scanner.nextLine();
                    selectedBook.setCheckedOut(true);
                    selectedBook.setCheckedOutTo(userName);
                    System.out.println("You have checked out: " + selectedBook.getTitle());
                } else
                    {
                        System.out.println("Invalid selection or the book is already checked out.");
                    }
            }

            public static void checkIn()
            {
                /*
                displays checkout out books along with their id, idbn,and title
                allow user to check in book
                 */
                System.out.println("\nChecked Out Books:");
                boolean checkedOutBooksExist = false;

                // Display the checked-out books
                for (Book book : books)
                {
                    if (book != null && book.isCheckedOut())
                    {
                        checkedOutBooksExist = true;
                        System.out.println(book.getId() + ") " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")" +
                                " - Checked out by: " + book.getCheckedOutTo());
                    }
                }

                if (!checkedOutBooksExist)
                {
                    System.out.println("No books are currently checked out.");
                    return;
                }

                // Prompt the user to return a book or go back to the main menu
                System.out.print("Enter the ID of the book you want to return (or 0 to return to the main menu): ");
                int bookId = scanner.nextInt();

                if (bookId == 0)
                {
                    return; // Go back to the main menu
                }

                Book selectedBook = findBookById(bookId);

                if (selectedBook != null && selectedBook.isCheckedOut())
                {
                    selectedBook.setCheckedOut(false);
                    selectedBook.setCheckedOutTo("");
                    System.out.println("You have returned: " + selectedBook.getTitle());
                } else
                    {
                        System.out.println("Invalid selection or the book is not checked out.");
                    }
            }


    // Helper method to find a book by its ID
    public static Book findBookById(int id)
    {
        for (Book book : books)
        {
            if (book != null && book.getId() == id)
            {
                return book;
            }
        }
        return null;
    }

}







