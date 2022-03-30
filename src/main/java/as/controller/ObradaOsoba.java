
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
    }

    @Override
    protected void kontrolaUpdate() throws AsException {

    }

    @Override
    protected void kontrolaDelete() throws AsException {

    }

    private void kontrolaOib() throws AsException {
        //https://github.com/domagojpa/oib-validation
        if (!OibValidation.checkOIB(entitet.getOib())) {
            throw new AsException("OIB nije formalno ispravan");
        }
    }}
