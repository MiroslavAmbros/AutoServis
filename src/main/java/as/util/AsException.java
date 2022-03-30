
package as.util;


public class AsException extends Exception{
    
    
    private String poruka;

    public AsException(String poruka) {
        super();
        this.poruka = poruka;
    }
    
    

    public String getPoruka() {
        return poruka;
    }
    
    
    
}