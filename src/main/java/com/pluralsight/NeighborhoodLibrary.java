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
            System.out.println("3. Quit");
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
        // Creating for loop to show array
        for (Books value : library) {
            if ((value != null) && !value.isCheckedOut()) {
                System.out.println("ID: " + value.getId() + ", Title: " + value.getTitle());
            }
        }
    }

    private static void showCheckedOutBooks(Books[] library){
        System.out.println("Available books ");
        // Creating for loop to show array
        for (Books value : library) {
            if ((value != null) && value.isCheckedOut()) {
                System.out.println("ID: " + value.getId() + ", Title: " + value.getTitle());
            }
        }
    }

    private static Books[] initializeInventory() {
        Books[] inventory = new Books[5];
        inventory[0] = new Books(1234, "97962181", "Estimated", false, ".");
        inventory[1] = new Books(234, "97803996", "The Undocumented Americans ", false, " .");
        inventory[2] = new Books(234, "97800208", "Modern American Women Writers", false, ".");
        inventory[3] = new Books(1234, "978141975", "Parable of the Sower", true, " .");
        inventory[4] = new Books(1234, "978141975", "Jane Eyre", false, " .");
        return inventory;
    }










}

