import org.example.CSVParser;
import org.example.CSVParserAbstract;
import org.example.Person;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CSVParserTest {
    @Before
    public void setupData() {
        parser = new CSVParser();
    }

    @Test
    public void setAndGetPath(){
        parser.setFilepath("some filepath");
        assertEquals(parser.getFilepath(),"some filepath");
    }

    @Test
    public void checkFilepath(){
        boolean result = parser.correctInputFilepath("C:\\Users\\79994\\IdeaProjects\\LABA4PMM\\foreign_names.csv");
        assertEquals(result,true);
    }

    @Test
    public void parse() throws IOException {
        parser.setFilepath("C:\\Users\\79994\\IdeaProjects\\LABA4PMM\\foreign_names.csv");
        List<Person> personList;
        personList = parser.fileRead();
        assertTrue(!personList.isEmpty());
    }





    private CSVParserAbstract parser;
}
