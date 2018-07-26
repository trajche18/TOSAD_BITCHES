package com.example.jersey.database.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseHelper_Repo {

    private String url = "ondora02.hu.nl";
    private String port = "8521";
    private String username = "tosad_2017_her_team1";
    private String password = "tosad_2017_her_team1";
    private String service = "cursus02.hu.nl";

    public Connection connection;

    public void connect() {
        try {
            System.out.println("connecting to " + url + " with username " + username);
            System.out.println(url);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//"+ url +":"+ port + "/" + service,username, password);
            System.out.println("connection successful");
        } catch (Exception e) {
            System.out.println("connection failed");
            e.printStackTrace();
        }

    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}