package com.pluralsight;

import java.awt.print.Book;
import java.util.Scanner;



public class NeighborhoodLibrary {
    public static void main(String[] args) {
        //Creating Library method
        Books[] library = initializeInventory();
        //System.out.println(library[2].title);


        Scanner menuScanner = new Scanner(System.in);
        while (true) {

            System.out.println("Welcome to the Library");
            System.out.println("Library Home Screen");
            System.out.println("===========================================");
            System.out.println("1. Show available books");
            System.out.println("2. Show Checked-out Books");
            System.out.println("3. check-in a book");
            System.out.println("4. Quit");
            System.out.println("===========================================");
            System.out.println("Enter option");

            int enterOption = menuScanner.nextInt();
            menuScanner.nextLine();


            switch (enterOption) {
                case 1:
                    showAvailableBooks(library);
                    break;
                case 2:
                    showCheckedOutBooks (library);
                    break;
                case 3:

                    break;

                case 4:
                    System.out.println("Thanks for vising the library come back soon");
                    menuScanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }

    }

    private static void showAvailableBooks(Books[] library) {
        System.out.println("Available books ");
        // Creating for loop to show the list of available books
        for (Books value : library) {
            if ((value != null) && !value.isCheckedOut()) {
                System.out.println("ID: " + value.getId() + " ISBN:" + value.getIsbn() + " Title: " + value.getTitle());
            }
        }

        // Ask the user if they want to checkout a book
        System.out.println("Do you want to checkout a book? Type Y for yes and N to return to the main menu");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter your name: ");
            String userName = scanner.nextLine();
            System.out.println("Enter the ID of the book you want to check-out: ");
            String getId = scanner.nextLine();
            library[Integer.parseInt(getId)].isCheckedOut = true;
            library[Integer.parseInt(getId)].checkedOutTo = userName;
            System.out.println("Book checkout");

        } else if (userInput.equalsIgnoreCase("N")) {
            return;


        } else {
            System.out.println("Invalid Option!");
        }
    }

    private static void showCheckedOutBooks(Books[] library){
        System.out.println("Available books ");
        // Creating for loop to show array
        for (Books value : library) {
            if ((value != null) && value.isCheckedOut()) {
                System.out.println("ID: " + value.getId() + ", Title: " + value.getTitle());
//                System.out.println("Enter C to check in a book: ");
//                System.out.println("Enter X to go back to home screen: ");

            }
        }
    }

    private static Books[] initializeInventory() {
        //System.out.println("Select a book to check out or exit back to the home screen");
        Books[] inventory = new Books[5];
        inventory[0] = new Books(0, "97962181", "Estimated", false, ".");
        inventory[1] = new Books(1, "97803996", "The Undocumented Americans ", false, " .");
        inventory[2] = new Books(2, "97800208", "Modern American Women Writers", false, ".");
        inventory[3] = new Books(3, "978141975", "Parable of the Sower", false, " .");
        inventory[4] = new Books(4, "978141975", "Jane Eyre", false, " .");
        return inventory;
    }

//    private static void checkInBook(Books[] library){
//        Books



    }













