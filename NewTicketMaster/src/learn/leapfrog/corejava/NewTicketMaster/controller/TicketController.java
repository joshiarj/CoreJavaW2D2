/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava.NewTicketMaster.controller;

import java.util.Scanner;
import learn.leapfrog.corejava.NewTicketMaster.util.TicketMaster;
import learn.leapfrog.corejava.NewTicketMaster.util.TicketMasterDAO;

/**
 *
 * @author Zeppelin
 */
public class TicketController {

    private TicketMasterDAO tm;
    private Scanner input;
    private int totalTickets;
    private int ticketNumber;

    public TicketController(TicketMasterDAO tm, Scanner input, int totalTickets) {
        this.tm = tm;
        this.input = input;
        this.totalTickets = totalTickets;
    }

    public void menu() {
        System.out.println("1. Sell Tickets.");
        System.out.println("2. Print Tickets.");
        System.out.println("3. Available Tickets.");
        System.out.println("4. Check Validity.");
        System.out.println("5. Print sold tickets.");
        System.out.println("6. Exit.");
        System.out.println("Enter your choice:");
    }

    public void sellView() {
        System.out.println("How many tickets do you want to sell?");
        int userSellTotal = input.nextInt();
        int[] userTicketNumber = new int[userSellTotal];
        if (userSellTotal <= totalTickets) {
            for (int i = 0; i < userTicketNumber.length; i++) {
                System.out.println("Enter ticket number to sell:");
                while (!tm.isValid(userTicketNumber[i])) {
                    userTicketNumber[i] = input.nextInt();
                }
                tm.sellTickets(userTicketNumber[i]);
                System.out.println("Ticket number " + userTicketNumber[i] + " is sold.");
            }
        } else {
            System.out.println("You cannot sell more than the total!");
        }
    }

    public void checkValidity() {
        System.out.println("Enter your ticket number:");
        if (tm.isValid(input.nextInt())) {
            System.out.println("Congrats, your ticket is VALID.");
        } else {
            System.out.println("Sorry, your ticket is INVALID.");
        }

    }

    public void exit() {
        System.out.println("Do you really want to exit? [Y/N]");
        if (input.next().equalsIgnoreCase("Y")) {
            System.exit(0);
        }
    }

    public void process() {
        while (true) {
            menu();

            switch (input.nextInt()) {
                case 1:
                    sellView();
                    break;
                case 2:
                    tm.printTickets();
                    break;
                case 3:
                    tm.unsoldTickets();
                    break;
                case 4:
                    checkValidity();
                    break;
                case 5:
                    tm.printSold();
                    break;
                case 6:
                    exit();
                    break;
            }
        }
    }

}
