
package as.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RadniNalog extends Entitet {
    
    private String rednibroj;
    @ManyToOne
    private Vozilo vozilo;
    private String opisservisa;
    private Date datum;
    @ManyToOne
    private Djelatnik djelatnik;

    public String getRednibroj() {
        return rednibroj;
    }

    public void setRednibroj(String rednibroj) {
        this.rednibroj = rednibroj;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public String getOpisservisa() {
        return opisservisa;
    }

    public void setOpisservisa(String opisservisa) {
        this.opisservisa = opisservisa;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }
}
