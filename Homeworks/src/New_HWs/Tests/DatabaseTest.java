package New_HWs.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class DatabaseTest {

    @Test
    public void testDatabase() {
        DB db = Mockito.mock(DB.class);
        Person person = new Person();
        //person = db.getPersonByQuery(DB.PERSON_BY_NAME, "Vasya");
        Mockito.when(db.getPersonByQuery(DB.PERSON_BY_NAME, "Vasya")).thenReturn(person);
    }
}