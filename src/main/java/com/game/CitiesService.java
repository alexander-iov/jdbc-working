package com.game;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CitiesService {

    public void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS cities(" +
                "id TEXT PRIMARY KEY," +
                "name TEXT UNIQUE);";
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
        }
    }

    public void addCity(City city, Connection connection) throws SQLException {
        String query = "INSERT INTO cities VALUES ('" + city.getId() + "', '" + city.getName() + "');";
        try (Statement statement = connection.createStatement()) {
            statement.execute(query);
        }
    }

    public List<City> getCities() {
        return null;
    }
}
