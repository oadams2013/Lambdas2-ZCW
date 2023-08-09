import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(){
        this("name",  null, null, null);
    }
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }
    public void setBirthday(int year, Month month, int dayOfMonth){
        birthday = LocalDate.of(year, month,dayOfMonth);

    }
    public void setGender(){
        this.gender = gender;
    }

    public int getAge() {
        //
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();

    }

    public void printPerson() {
        String output = "%s is %d years old. They are %s. Find them at %s";
        System.out.format(output, name ,getAge() , gender, emailAddress);

    }
    public static void printPersons(List<Person> roster, CheckPerson tester){
        for (Person p : roster){
            if (tester.test(p)){
                p.printPerson();
            }
        }
    }
}
