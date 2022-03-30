
package as.controller;

import as.util.AsException;
import as.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public abstract class Obrada<T> {
    
    protected Session session;
    protected T entitet;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws AsException;
    protected abstract void kontrolaUpdate() throws AsException;
    protected abstract void kontrolaDelete() throws AsException;
    
    public Obrada(){
        session=HibernateUtil.getSession();
    }
    
    public T create() throws AsException{
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T update() throws AsException{
        kontrolaUpdate();
        save();
        return entitet;
    }
    
    public void delete() throws AsException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }
    
    private void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
}