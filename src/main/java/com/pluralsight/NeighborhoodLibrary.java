package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Books[] books = new Books[20];
    private static int numBooks = 5;

    public static void main(String[] args) {
        books[0] = new Books("Jane Eyre", 50595, " 999777321", false, " .");
        books[1] = new Books("Estimated", 52499, " 979865490",false, " ." );
        books[2] = new Books("The Undocumented Americans", 52600, " 978039946", false, ". ");
        books[3] = new Books("Atomic Habits", 52700, " 978073511", false, ".");
        books[4] = new Books(" Modern American Women Writer", 52795, "002820259", false, ". ");


        Scanner menuScanner = new Scanner(System.in);
        while(true){

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


            switch(enterOption){
                case 1:// coming back to this

                    break;
                case 2://working on this

                    break;

                case 3:
                    System.out.println("Thanks for vising the library c!ome back soon");
                    return;
            }
        }





    }

}








