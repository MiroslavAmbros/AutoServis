/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.controller;

import as.model.Djelatnik;
import as.model.Vlasnik;
import as.util.AsException;
import java.util.List;

/**
 *
 * @author Miroslav
 */
public class ObradaDjelatnik extends ObradaOsoba<Djelatnik> {

    @Override
    public List read() {
        return session.createQuery("from Djelatnik").list();

    }
    
    
    public List<Djelatnik> read(String uvjet) {
        return session.createQuery("from Djelatnik p "
                + " where concat(p.ime) "
                + " like :uvjet order by p.ime")
                .setParameter("uvjet","%" + uvjet + "%")
                .setMaxResults(50)
                .list();
    }
    
    @Override
    protected void kontrolaCreate() throws AsException {

    }

    @Override
    protected void kontrolaUpdate() throws AsException {

    }

    @Override
    protected void kontrolaDelete() throws AsException {

    }

}
