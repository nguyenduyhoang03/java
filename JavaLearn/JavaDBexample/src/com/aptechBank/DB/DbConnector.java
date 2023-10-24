package com.aptechBank.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    public static Connection getConnection() throws SQLException {
        String hostName = "localhost"; //127.0.1
        String dbName = "javaExample";
        String username = "root";
        String password = "";
        //chuoi ket noi den database
        //"jdbc:myqsql://localhost:3306/javaexample,username,password"
        String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection connection = DriverManager.getConnection(connectionUrl,username,password);
        return connection;
    }
}
