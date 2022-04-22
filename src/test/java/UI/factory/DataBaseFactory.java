package UI.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseFactory {

    private static Connection con;

    public static Connection getDB(String dbname) throws ClassNotFoundException {

        try {
            if (dbname == "hsqldb") {
                Class.forName("org.hsqldb.jdbc.JDBCDriver");
                con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb;hsqldb.lock_file=false", "SA", "");
                System.out.println("HSQLDB connection established successfully");
                return con;
            }
        } catch (ClassNotFoundException e ){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
