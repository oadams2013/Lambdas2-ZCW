import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CheckPersonTest {



    @Test
    public void checkPersonWithLocalClass(){
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(1987, Month.JULY, 24),
                Person.Sex.MALE, "himynameisjoehuntenburg@pain.com"));
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2023, Month.AUGUST, 8),
        Person.Sex.MALE, "bestchef@chef.com"));
        listOfPeople.add(new Person("Maggie Synder", LocalDate.of(1995, Month.DECEMBER, 31),
                Person.Sex.FEMALE, "magsbarbie@barbie.com"));
        //Given
        CheckPersonConcrete tester = new CheckPersonConcrete();

        //When
        System.out.println();
        Person.printPersons(listOfPeople, tester);
        //Then



    }
}


