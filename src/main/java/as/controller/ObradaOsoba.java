
package as.controller;

import as.model.Osoba;
import as.util.AsException;
import as.util.OibValidation;

/**
 *
 * @author Miroslav
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws AsException {
        kontrolaOib();
        kontrolaIme();
    }

    @Override
    protected void kontrolaUpdate() throws AsException {
kontrolaIme();
    }

    @Override
    protected void kontrolaDelete() throws AsException {

    }

    private void kontrolaOib() throws AsException {
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new AsException("OIB nije formalno ispravan");
        }
    }
    private void kontrolaIme() throws AsException {
        if (!entitet.getIme().matches("\\p{L}+") || !entitet.getPrezime().matches("\\p{L}+")) {
            throw new AsException("Ime smije sadržavati samo slova");
        }

    }
}
