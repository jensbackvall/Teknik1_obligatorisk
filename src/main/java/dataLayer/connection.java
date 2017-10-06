package dataLayer;

import java.sql.*;

public class connection {

    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapptutorial";

    //database username and password
    static final String USER = "webappuser";
    static final String PASSWORD = "test123";

    public Connection openConnection() {

        Connection conn = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.print("Error: " + e);
        }

        return conn;
    }

}
