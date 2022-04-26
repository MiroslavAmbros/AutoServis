/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.controller;

import as.model.Vlasnik;
import java.util.List;

/**
 *
 * @author Miroslav
 */
public class ObradaVlasnik extends ObradaOsoba<Vlasnik>{

    @Override
    public List<Vlasnik> read() {
        return session.createQuery("from Vlasnik").list();
    }
    
    


}
