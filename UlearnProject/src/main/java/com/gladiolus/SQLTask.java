package com.gladiolus;

import java.sql.Connection;
import java.sql.SQLException;

public class SQLTask {
    public static int findAverageNumberPeopleInTenCountries(String counties, Connection connection) throws SQLException {
        try (var statement = connection.prepareStatement("SELECT AVG(students) FROM schools WHERE county == ?")) {
            statement.setObject(1, counties);
            return statement.executeQuery().getInt(1);
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    public static void displayAverageAmountExpenses(String[] counties, Connection connection) throws SQLException {
        try (var statement = connection.prepareStatement("SELECT AVG(expenditure) FROM schools WHERE expenditure > 10 AND county in (?,?,?,?)")) {
            for (var e : counties)
                statement.setObject(1, e);

            System.out.println(statement.executeQuery().getInt(1));
        } catch (SQLException e) {
            throw new SQLException();
        }
    }

    public static void displaySchoolWithMaxMath(Connection connection) throws SQLException {
        try (var statement = connection.prepareStatement("SELECT school FROM schools WHERE 5000 < students < 7500 OR 10000 < students < 11000 ORDER BY math DESC LIMIT 1")) {
            System.out.println(statement.executeQuery().getString(1));
        } catch (SQLException e) {
            throw new SQLException();
        }
    }
}
