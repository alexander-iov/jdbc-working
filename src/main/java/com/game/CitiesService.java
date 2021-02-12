package com.game;

import java.util.ArrayList;
import java.util.List;

public class CitiesService {

    private final List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }
}
