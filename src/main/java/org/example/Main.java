package org.example;


import java.io.IOException;
import java.util.*;

public class Main {

    public static  void main(String[] args) throws IOException {
        List<Person> personList;
        String filepath = "C:\\Users\\79994\\IdeaProjects\\LABA4PMM\\foreign_names.csv";
        CSVParserAbstract reader = new CSVParser(filepath);

        personList = reader.fileRead();
        for (int i = 1; i < personList.size(); i++)
            System.out.println(personList.get(i));
    }
}