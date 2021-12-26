package com.gladiolus;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHandler {
    private static DbHandler instance = null;

    public static synchronized DbHandler getInstance() throws SQLException {
        if (instance == null)
            instance = new DbHandler();
        return instance;
    }
    public Connection connection;
    private static final String CON_STR = "jdbc:sqlite:identifier.sqlite";

    private DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(CON_STR);
    }

    public void addProduct(School school) {
        try (var statement = this.connection.prepareStatement(
                "INSERT INTO schools(`school`, `county`, `students`,`expenditure`,`math`) VALUES(?, ?, ?, ?, ?)")) {
            statement.setObject(1, school.getSchool());
            statement.setObject(2, school.getCounty());
            statement.setObject(3, school.getStudents());
            statement.setObject(4, school.getExpenditure());
            statement.setObject(5, school.getMath());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
