package as.view;

import as.model.Vlasnik;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 *
 * @author Lord Pupcent
 */
public class VlasnikComparator implements Comparator<Vlasnik> {

    private Collator hr;

    public VlasnikComparator() {
        hr = Collator.getInstance(new Locale("hr", "HR")); //Your locale here
        hr.setStrength(Collator.PRIMARY);
    }

    @Override
    public int compare(Vlasnik o1, Vlasnik o2) {
        return hr.compare(o1.getIme(), o2.getIme());
    }

}
