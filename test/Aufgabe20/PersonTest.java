package Aufgabe20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private CSVParser<Person> parser;

    @BeforeEach
    public void setUp() {
        parser = new CSVParser<>(Person.class);
    }

    @Test
    public void testParseValidCSV() throws CSVParseException {
        String csvData = "Name,Age,Height\nAlice,30,170\nBob,25,180";
        List<Person> people = parser.parse(new StringReader(csvData));

        assertEquals(2, people.size());

        Person person1 = people.get(0);
        assertEquals("Alice", person1.getName());
        assertEquals(30, person1.getAge());
        assertEquals(170, person1.getHeight());

        Person person2 = people.get(1);
        assertEquals("Bob", person2.getName());
        assertEquals(25, person2.getAge());
        assertEquals(180, person2.getHeight());
    }
}
