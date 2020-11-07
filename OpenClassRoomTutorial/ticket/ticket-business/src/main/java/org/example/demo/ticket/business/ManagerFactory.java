package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();
    private ProjetManager projetManager;
    private TicketManager ticketManager;

    /**
     * Constructeur
     */
    public ManagerFactory(){
        super();
    }

    /**
     * Renvoir l'instance unique de la classe (Singleton)
     * @return
     */
    public static ManagerFactory getInstance(){
        return  ManagerFactory.INSTANCE;
    }


    public ProjetManager getProjetManager() {
        return projetManager;
    }

    public void setProjetManager(ProjetManager vProjetManager){
        projetManager = vProjetManager;
    }

    public TicketManager getTicketManager() {
        return new TicketManager();
    }

    public void setTicketManager(TicketManager vTicketManager){
        ticketManager = vTicketManager;
    }
}