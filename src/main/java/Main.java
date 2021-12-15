import Person.Person;
import Person.PersonFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonFactory f = new PersonFactory();
        List<Person> persons = f.personList();
        for(Person p : persons){
            System.out.println(p);
        }
    }
}
