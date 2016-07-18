package New_HWs.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ServiceTest {

    @Test
    public void testService() {
        DB mock = Mockito.mock(DB.class);
        Mockito.when(mock.getById(1)).thenReturn(new Person().setId(1).setName("").setGamePlayed(100).setNumberOfWins(10));
        Service service = new Service(mock);
        Assert.assertEquals("Expected 0.9.", 0.9, service.getPercentOfPersonLoses(1), 0);
    }
}