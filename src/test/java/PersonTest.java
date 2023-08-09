import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getAge(){
        //Given
        Person p = new Person();
        int expected = 13;
        //When
        int age = p.getAge();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getGender(){
        //Given
        Person.Sex expected = Person.Sex.FEMALE;
        Person person = new Person();
        p.setGender(expected);
        //When
        Person.Sex actual = p.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
