package com.mycompany.oes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class MyConnection {
    public Connection connection;
    public Statement statement;

    public MyConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/oes";
        String user = "postgres";
        String password = "1230";

        connection = getConnection(url, user, password);
        statement = connection.createStatement();
    }
}
