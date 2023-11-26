package org.example;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.opencsv.CSVReader;


import com.opencsv.CSVReaderBuilder;

import org.apache.commons.io.FilenameUtils;

public class CSVParser implements CSVParserAbstract {

    private String filepath;

    public CSVParser(String path){
        filepath = path;
    }

    public CSVParser(){
        filepath = "";
    }
    @Override
     public boolean correctInputFilepath(String path) {
        File file = new File(path);
        if (file.exists() && FilenameUtils.getExtension(path).equals("csv")) {
            filepath = path;
            return true;
        }
        return false;
    }

    @Override
    public String getFilepath() {
        return filepath;
    }

    @Override
    public void setFilepath(String path) {
        filepath = path;
    }

    @Override
    public List<Person> fileRead() throws IOException {
        List<Person> personList = new ArrayList<>();
        if (correctInputFilepath(filepath)) {
            char separator = ';';
            CSVReader reader = new CSVReader(new FileReader(filepath), separator);
            String[] nextStr;
            reader.readNext();
            while ((nextStr = reader.readNext()) != null) {
                Random randomID = new Random();
                int divisionID = randomID.nextInt(1000) + 1;

                personList.add(new Person(nextStr[0], nextStr[1], nextStr[2], nextStr[3], nextStr[4], nextStr[5], divisionID));
            }
        }
        return personList;
    }
}