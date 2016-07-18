package New_HWs.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class DatabaseTest {

    @Test
    public void testDatabase1() {
        DB db = Mockito.spy(DB.class);
        Person person = new Person();
        doReturn(person).when(db).getPersonByQuery("select * from Person where name = ?", "Vasya");
        doReturn(person).when(db).getPersonByQuery("select * from Person where name = ?", "Petya");
        assertEquals(db.getByName("Vasya"), person);
        assertEquals(db.getByName("Petya"), person);
    }

    @Test
    public void testDatabase2() {
        DB db = Mockito.spy(DB.class);
        Person person = new Person();
        doReturn(person).when(db).getByName("Vasya");
        assertEquals(db.getByName("Vasya"), person);
    }

    @Test
    public void testDatabase3() {
        DB db = Mockito.spy(DB.class);
        Person person = new Person();
        doReturn(person).when(db).getPersonByQuery(DB.PERSON_BY_NAME, "Vasya");
        assertEquals(db.getByName("Vasya"), person);
    }
}

/*
1) person, который создан в 15-ой строке, и person, который возвращает БД - это разные объекты, соотвественно разные
ссылки на объекты, несмотря на то, что они одного типа (Person). Я могу понять, что метод в 17 строке отрабатывает
потому что там используется Мокированный объект, но почему выполняется Ассёршн в 18-ой строке я понять не могу...
Как я понимаю, мы обращаемся напрямую к БД, которой в общем-то нет...
2) Мы не делаем запись, мы делаем чтение. Почему если закомментировать 17-ю строку, 19-ая выкинет исключение, а если
17-ую раскомменировать, тест пройдёт?
*/