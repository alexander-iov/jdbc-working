package com.game;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public void addCity(City city, Connection connection) {
        String query = "INSERT INTO cities VALUES ('" + city.getId() + "', '" + city.getName() + "');";
        try (Statement statement = connection.createStatement()) {
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println("Write another city name");
        }
    }

    public List<City> getCities(Connection connection) throws SQLException {
        String query = "SELECT name FROM cities";
        List<City> cityList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                cityList.add(new City(resultSet.getString(1)));
            }
        }
        return cityList;
    }
}
