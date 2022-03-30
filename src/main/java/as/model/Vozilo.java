
package as.model;

import javax.persistence.ManyToOne;

public class Vozilo extends Entitet {
    private String registracija;
    private String brojsasije;
    private String kilometraza;
    @ManyToOne
    private Vlasnik vlasnik;

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getBrojsasije() {
        return brojsasije;
    }

    public void setBrojsasije(String brojsasije) {
        this.brojsasije = brojsasije;
    }

    public String getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(String kilometraza) {
        this.kilometraza = kilometraza;
    }
}
