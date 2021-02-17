package com.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {

        CitiesService service = new CitiesService();
        String url = "jdbc:sqlite:C:\\SQLite\\homeworks.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            service.createTable(connection);
            System.out.println("Enter new City name: ");
            service.addCity(new City(writeName()), connection);
            service.getCities(connection).forEach(System.out::println);
        }
    }

    private static String writeName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
