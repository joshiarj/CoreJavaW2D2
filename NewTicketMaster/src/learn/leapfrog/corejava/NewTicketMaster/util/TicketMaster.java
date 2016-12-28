/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava.NewTicketMaster.util;

import java.util.Scanner;

/**
 *
 * @author Zeppelin
 */
public class TicketMaster implements TicketMasterDAO {

    Scanner input = new Scanner(System.in);

    private int[] tickets, sold;
    private int start, total;
    private int unsold = 0;

    public TicketMaster() {

    }

    public TicketMaster(int start, int total) {
        this.start = start;
        tickets = new int[total];
        sold = new int[total];
        //unsold = new int[total];

    }

    @Override
    public void generate() {
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = start;
            start++;
        }
    }

    @Override
    public boolean isValid(int ticketNumber) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == ticketNumber) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printTickets() {
        System.out.println("All tickets are:");
        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i]);
        }

    }

    @Override
    public void printSold() {
        System.out.println("Sold tickets are:");
        for (int i = 0; i < sold.length; i++) {
            if (sold[i] != 0) {
                System.out.println(sold[i]);
            }
        }
    }

    @Override
    public boolean isSold(int ticketNumber) {
        for (int i = 0; i < sold.length; i++) {
            if (sold[i] != 0) {
                if (sold[i] == ticketNumber) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public void sellTickets(int ticketNumber) {
        for (int i = 0; i < sold.length; i++) {
            if (sold[i] == 0) {
                sold[i] = ticketNumber;
                break;
            }
        }
    }

    @Override
    public void unsoldTickets() {
        System.out.println("Available tickets are:");
        for (int i = 0; i < sold.length; i++) {
            if (sold[i] != 0) {
                for (int j = 0; j < tickets.length; j++) {
                    if (sold[i] != tickets[j]) {
                        unsold = tickets[j];
                    }
                    System.out.println(unsold);
                    unsold = 0;
                }
            }
        }
    }

    /*
    public void isAvailable() {
        System.out.println("Enter ticket number to check availability:");
        if (isSold(input.nextInt()) == false) {
            System.out.println("Ticket is available.");
        } else {
            System.out.println("Ticket is unavailable.");
        }

    }*/
}
