
package as.model;

import javax.persistence.Entity;

@Entity
public class Vlasnik extends Osoba {
    
    private String brojtelefona;

    public String getbrojtelefona() {
        return brojtelefona;
    }

    public void setbrojtelefona(String brojtelefona) {
        this.brojtelefona = brojtelefona;
    }

    
    
    
}
