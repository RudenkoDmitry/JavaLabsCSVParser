package org.example;

public class Person {

    public Person() {
        id = "";
        name = "";
        gender = "";
        salary = "";
        birthDate = "";
        subdivision = new Subdivision("", 0);
    }


    Person(String newId, String newName, String newGender, String newBirthDate, String newNameSubd,String newSalary, int newIdSubd)
    {
        id = newId;
        name = newName;
        gender = newGender;
        salary = newSalary;
        birthDate = newBirthDate;
        subdivision = new Subdivision(newNameSubd, newIdSubd);
    }

    @Override
    public String toString() {
        return id + "; " +
                name + "; " +
                gender + "; " +
                salary + "; " +
                birthDate + "; " +
                subdivision.getDivisionName() + "; " +
                subdivision.getId();
    }

    private final String id;

    private final String name;


    private final String gender;


    private final String birthDate;

    private final Subdivision subdivision;

    private final String salary;
}
