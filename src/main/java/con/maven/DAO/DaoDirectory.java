package con.maven.DAO;

import con.maven.mavenClass.Director;
import con.maven.mavenEntity.DirectorEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 *
 * @author ross
 */
public class DaoDirectory {
    
    
    private Session sessionObj;
    private SessionFactory sessionFactoryObj;


    // This Method Is Used To Create The Hibernate's SessionFactory Object
    private SessionFactory buildSessionFactory() {
        return NewHibernateUtil.getSessionFactory();
        
    }


    public void save(Director director) {
        DirectorEntity direc = new DirectorEntity(director);
        sessionObj = buildSessionFactory().openSession();
        sessionObj.beginTransaction();
        sessionObj.save(direc);
        sessionObj.getTransaction().commit();
    }

    public void delete(int direc) {

    }

    public void update(DirectorEntity direc, int id) {

    }

    public Director get(int direc) {
        return null;

    }
}
