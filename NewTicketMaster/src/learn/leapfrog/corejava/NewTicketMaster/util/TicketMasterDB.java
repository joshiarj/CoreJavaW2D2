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
public class TicketMasterDB implements TicketMasterDAO {

    @Override
    public void generate() {
        System.out.println("Generating tickets");
    }

    @Override
    public boolean isValid(int ticketNumber) {
        System.out.println(" is valid");
        return true;
    }

    @Override
    public void printTickets() {
        System.out.println("Printing tickets from DB");
    }

    @Override
    public void printSold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isSold(int ticketNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sellTickets(int ticketNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unsoldTickets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
