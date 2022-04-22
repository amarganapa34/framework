package UI.dbutil;


import java.sql.*;

public class DbOps {

    public static void executeStmnt(Connection con, String query) throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.execute();
        System.out.println("SQL Query execute :" + query);
       }

       public static ResultSet executeStmntsSelect(Connection con, String query) throws SQLException {
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        return resultSet;
       }

    public static void executeInsertStmnt(Connection cn, String query, String sValue) throws SQLException {
        PreparedStatement preparedStatement = cn.prepareStatement(query);
        preparedStatement.setString (1, sValue);
        preparedStatement.setString (2, "title"+sValue);
        preparedStatement.setString (3, "user"+sValue);
        preparedStatement.setString (4, "passwd"+sValue);
        preparedStatement.setString (5, "comment"+sValue);
        preparedStatement.execute();
        System.out.println("SQL Query executed");
    }

    public static void  executeInsertStatement(Connection cn, String query, String value) throws SQLException {
        PreparedStatement preparedStatement = cn.prepareStatement(query);
        preparedStatement.setString(1, value);
        preparedStatement.setString(2, "page_name"+value);
        preparedStatement.setString(3,"message"+value);
        preparedStatement.execute();
        System.out.println("SQL Query Executed: " + query);
    }
}
