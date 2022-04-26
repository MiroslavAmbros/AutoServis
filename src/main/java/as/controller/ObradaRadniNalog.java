/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.controller;

import as.model.RadniNalog;
import as.util.AsException;
import java.util.List;

/**
 *
 * @author Miroslav
 */
public class ObradaRadniNalog extends Obrada<RadniNalog> {

    @Override
    public List<RadniNalog> read() {
        return session.createQuery("from fadninalog").list();
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
