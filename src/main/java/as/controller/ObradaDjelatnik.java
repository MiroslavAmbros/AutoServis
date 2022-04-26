/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.controller;

import as.model.Djelatnik;
import java.util.List;

/**
 *
 * @author Miroslav
 */
public class ObradaDjelatnik extends ObradaOsoba<Djelatnik>{

    @Override
    public List read() {
        return session.createQuery("from Djelatnik").list();
        
    }
    
    
}
