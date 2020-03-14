
import con.maven.DAO.DaoDirectory;
import con.maven.DAO.myConection;
import con.maven.mavenClass.Director;
import org.junit.Test;

/**
 *
 * @author ross
 */
public class TestDB {
@Test
public void crearConexion(){
    DaoDirectory daodir = new DaoDirectory();
    
    
    daodir.save(new Director("el Aldair",12,"Marin"));
}
}
