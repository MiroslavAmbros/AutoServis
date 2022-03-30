package as.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    @Column(columnDefinition = "char(11)")
    private String oib;
    

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime==null ? ime : ime.trim();
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime==null ? prezime : prezime.trim();
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

  
}