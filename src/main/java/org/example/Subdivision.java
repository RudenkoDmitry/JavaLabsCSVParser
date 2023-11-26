package org.example;

class Subdivision {

    public Subdivision(String newName, int id_subd) {
        name = newName;
        id = id_subd;
    }

    public int getId() {
        return id;
    }

    public String getDivisionName() {
        return name;
    }

    private final int id;

    private final String name;
}
