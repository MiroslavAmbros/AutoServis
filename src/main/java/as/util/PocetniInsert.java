/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as.util;

import as.model.Operater;
import as.model.Osoba;
import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author CP
 */
public class PocetniInsert {

    public static void unosOperatera() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Operater o = new Operater();
        o.setIme("Eduard");
        o.setPrezime("Kuzma");
        o.setUloga("oper");
     
        o.setLozinka(BCrypt.hashpw("e", BCrypt.gensalt()));
        session.save(o);
        session.getTransaction().commit();
    }
   private static List<Osoba> generirajOsobe(Faker faker, Session session) {
        List<Osoba> osobe = new ArrayList();
        Osoba o;
        for (int i = 0; i < 10; i++) {
            o = new Osoba() {};
            o.setIme(faker.name().firstName());
            o.setPrezime(faker.name().lastName());
            session.save(o);
            osobe.add(o);
            System.out.println("Kreirao osobu: " + o.getIme() + " " + o.getPrezime());
        }
        return osobe;
    }
    
 

}
