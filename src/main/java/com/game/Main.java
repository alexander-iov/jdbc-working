package com.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException {

        CitiesService service = new CitiesService();
        String url = "jdbc:sqlite:C:\\SQLite\\homeworks.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println(connection.getTransactionIsolation());
            service.addCity(new City(UUID.randomUUID().toString(), "Kiev"), connection);
        }

    }
}
