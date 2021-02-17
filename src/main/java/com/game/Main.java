package com.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        CitiesService service = new CitiesService();
        String url = "jdbc:sqlite:C:\\SQLite\\homeworks.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            service.createTable(connection);
            service.getCities(connection).forEach(System.out::println);
        }

    }
}
