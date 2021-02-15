package com.game;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CitiesService {

    public void addCity(City city, Connection connection) throws SQLException {
        String query = "INSERT INTO cities VALUES (" + city.getId() + ", " + city.getName() + ");";
        try (Statement statement = connection.createStatement()) {
            statement.execute(query);
        }
    }

    public List<City> getCities() {
        return null;
    }
}
