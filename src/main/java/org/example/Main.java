package org.example;

import java.util.Scanner;

public class Main {
    static MainMenu menu = new MainMenu();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu.showMenu();
            System.out.println("Select an option :");
            try {
                int select = scn.nextInt();
                scn.nextLine();

                switch (select) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        System.out.print("Good Bye !!!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid input, please try again.\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.\n");
                scn.nextLine();
            }
        }
    }
}
