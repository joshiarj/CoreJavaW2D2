/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava.NewTicketMaster;

import java.util.Scanner;
import learn.leapfrog.corejava.NewTicketMaster.controller.TicketController;
import learn.leapfrog.corejava.NewTicketMaster.util.TicketMaster;
import learn.leapfrog.corejava.NewTicketMaster.util.TicketMasterDAO;
import learn.leapfrog.corejava.NewTicketMaster.util.TicketMasterDB;

/**
 *
 * @author Zeppelin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTicketNumber = 101, totalTickets = 5;
        TicketMasterDAO tmdao = new TicketMaster(startTicketNumber, totalTickets);
        new TicketController(tmdao, new Scanner(System.in), totalTickets).process();
    }

}
