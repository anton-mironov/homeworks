package New_HWs.Tests;

import org.junit.*;
import org.mockito.Mockito;

public class TestScenario {
    public static String test;

    @BeforeClass
    public static void prepareGlobal() {
        System.out.println("Prepare global variables");
        test = "string 1";
    }

    @Before
    public void prepareBeforeEachRun() {
        System.out.println("Before test method invocation");
        System.out.println(test);
    }

    @Test
    public void test1() {
        System.out.println("Some test 1");
        System.out.println(test);
        assert true;
    }

    @Test
    public void test2() {
        System.out.println("Some test 2");
        System.out.println(test);
        assert false;
    }

    @After
    public void afterEachRun() {
        System.out.println("Before test method invocation");
    }

    @AfterClass
    public static void afterGlobal() {
        System.out.println("After all methods");
        System.out.println(test);
    }

    @Test
    public void test3() {
        DB mock = Mockito.mock(DB.class);
        Mockito.when(mock.getByName("")).thenReturn(new Person().setId(1).setName("").setGamePlayed(100).setNumberOfWins(10));
        Service service = new Service(mock);
        Assert.assertEquals("Expected 0.1", 0.2, service.getPersonScore(""), 0.1);
        //Assert.assertTrue("My exception description", false);
    }

    @Test
    public void test4() {
        DB mock = Mockito.mock(DB.class);//spy
        Mockito.when(mock.getById(1)).thenReturn(new Person().setId(1).setName("").setGamePlayed(100).setNumberOfWins(10));
        Service service = new Service(mock);
        Assert.assertEquals("Expected 10", 10, service.getPersonWins(1), 0);
        //Assert.assertTrue("My exception description", false);
    }
}