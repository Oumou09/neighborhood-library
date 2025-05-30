package com.pluralsight;

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
        System.out.println("Available books: ");
        // Creating for loop to show the list of available books
        for (Books value : library) {
            if ((value != null) && !value.isCheckedOut()) {
                System.out.println("ID: " + value.getId() + " ISBN:" + value.getIsbn() + " Title: " + value.getTitle());

            }
        }

        // Ask the user if they want to check-out a book
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
        Scanner scanner = new Scanner(System.in);
            Boolean anyCheckedOut = false;
            for (Books value : library) {
                if (value != null && value.isCheckedOut()) {
                    System.out.println("ID: " + value.getId() + ", Title: " + value.getTitle() + ", Checked-out to: " + value.getCheckedOutTo());
                    anyCheckedOut = true;
                }
            }
            if (!anyCheckedOut) {
                System.out.println("No books are currently checked out.");
            }

            // Now allow the user to press a key
            System.out.println("\nPress V to check out a new book, or any other key to exit:");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("V")) {
                showCheckedOutBooks(library); // Call a new method to handle checking out
            }

//            System.out.println("Enter C to check in a book: ");
//            String userInput2 = scanner.nextLine();
//            if (userInput2.equalsIgnoreCase("C")){
//               return;
//
//            }
                //System.out.println("Enter X to go back to home screen: ");
            System.out.println("\nEnter C to check in a book, or any other key to exit: ");
            String userInput2 = scanner.nextLine();
            if (userInput2.equalsIgnoreCase("C")) {
                System.out.println("Enter the Tittle of the book you want to check in:");
                String bookIdInput = scanner.nextLine();

                // Find the book by ID and check it in
                for (Books value1 : library) {
                    if (value1 != null && value1.getTitle().equals(bookIdInput)) {
                        value1.setCheckedOut(false); // Mark it as not checked out
                        value1.setCheckedOutTo(null); // Clear the "checked out to" field
                        System.out.println("Book '" + value1.getTitle() + "' has been successfully checked in!");
                        return;
                    }
                }

                System.out.println("No book found with that Tittle.");
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


}



//    private static void checkInBook(Books[] library){
//        Books















