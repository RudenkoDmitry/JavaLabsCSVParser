package org.example;

import java.io.IOException;
import java.util.List;

public interface CSVParserAbstract {

    String getFilepath();
    void setFilepath(String path);

    public List<Person> fileRead() throws IOException;

    boolean correctInputFilepath(String path);
}
