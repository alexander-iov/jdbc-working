package com.game;

import java.util.UUID;

public final class City {

    private final String id;
    private final String name;

    public City(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
