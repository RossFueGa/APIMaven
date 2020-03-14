package con.maven.DAO;
import java.sql.*;

/**
 *
 * @author ross
 */
public class myConection {
    private static Connection CONNECTION_INSTANCE = null;

    public static Connection getInstance() {
        if (CONNECTION_INSTANCE == null) {
            try {
                CONNECTION_INSTANCE = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_prueba", "ross", "pandas");
            } catch (SQLException ex) {
                assert false : ex.getMessage();
            }
        }
        return CONNECTION_INSTANCE;
    }
}
