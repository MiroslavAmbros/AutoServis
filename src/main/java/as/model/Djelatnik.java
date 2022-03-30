/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package as.model;

import javax.persistence.Entity;

/**
 *
 * @author CP
 */
@Entity
public class Djelatnik extends Osoba{
    
    private String iban;
    

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
