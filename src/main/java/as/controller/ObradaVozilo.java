/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.controller;

import as.model.Vozilo;
import as.util.AsException;
import java.util.List;

/**
 *
 * @author Miroslav
 */
public class ObradaVozilo extends Obrada<Vozilo>{

    @Override
    public List<Vozilo> read() {
       return session.createQuery("from Vozilo").list();
    }

    @Override
    protected void kontrolaCreate() throws AsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaUpdate() throws AsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaDelete() throws AsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
