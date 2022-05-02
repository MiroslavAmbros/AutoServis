/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as.util;

import as.model.Djelatnik;
import as.model.Operater;
import as.model.Osoba;
import as.model.Vlasnik;
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

    public static void unosAdmina() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Operater o = new Operater();
        o.setKorisnickoime("Admin");
        o.setUloga("admin");
     
        o.setLozinka(BCrypt.hashpw("admin", BCrypt.gensalt()));
        session.save(o);
        session.getTransaction().commit();
    }
    public static void unosOperatera() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Operater o = new Operater();
        o.setKorisnickoime("Operater");
        o.setUloga("oper");
        o.setLozinka(BCrypt.hashpw("o", BCrypt.gensalt()));

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
    
 public static void izvedi() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Faker faker = new Faker();

        List<Djelatnik> djelatnik = generirajDjelatnike(faker, session);
        List<Vlasnik> vlasnik = generirajVlasnike(faker, session);
        
       
        session.getTransaction().commit();

    }
  private static List<Djelatnik> generirajDjelatnike(Faker faker, Session session) {
        List<Djelatnik> djelatnici = new ArrayList();
        Djelatnik d;
        for (int i = 0; i < 5; i++) {
            d = new Djelatnik();
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            d.setOib(AsUtil.generirajOib());
            d.setIban("");
            session.save(d);
            djelatnici.add(d);
            System.out.println("Krierao djelatnika: " + d.getIme() + " " + d.getOib());
        }
        return djelatnici;
    }

    private static List<Vlasnik> generirajVlasnike(Faker faker, Session session) {
        List<Vlasnik> vlasnici = new ArrayList();
        Vlasnik v;
        for (int i = 0; i < 20; i++) {
            v = new Vlasnik();
            v.setIme(faker.name().firstName());
            v.setPrezime(faker.name().lastName());
            v.setOib(AsUtil.generirajOib());
            
            session.save(v);
            vlasnici.add(v);
            System.out.println("Krierao vlasnika: " + v.getIme() + " " +v.getOib());
        }
        return vlasnici;
    }
}
