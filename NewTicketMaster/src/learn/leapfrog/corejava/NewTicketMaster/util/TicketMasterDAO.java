/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.leapfrog.corejava.NewTicketMaster.util;

/**
 *
 * @author Zeppelin
 */
public interface TicketMasterDAO {
    
    void generate();
    boolean isValid(int ticketNumber);
    void printTickets();
    void printSold();
    boolean isSold(int ticketNumber);
    void sellTickets(int ticketNumber);
    void unsoldTickets();
    
    
}
