package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonFactory {

    private Person createPerson(){
        return new Person();
    }

    public List<Person> personList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number of Person to create: ");
        int count = in.nextInt();
        List<Person> p = new ArrayList<>();
        for(int i = 0; i < count; i++){
            p.add(createPerson());
        }
        return p;
    }
}
