package Person;

import com.github.javafaker.Faker;
import java.util.Locale;

public class Person {
    private String email;
    private String firstname;
    private String lastname;
    private String city;
    private String country;
    private String personalId;

    Person() {
        this.firstname = this.setFirstName();
        this.lastname = this.setLastName();
        this.email = this.setEmail();
        this.city = this.setCity();
        this.country = this.setCountry();
        this.personalId = this.setPersonalId();
    }

    private Faker faker = new Faker(new Locale("en-US"));

    private String setEmail(){
        return this.getFirstname() + this.getLastname()+ '@' + faker.internet().emailAddress().split("@")[1];
    }

    private String setFirstName(){
        return faker.name().firstName();
    }

    private String setLastName(){
        return faker.name().lastName();
    }

    private String setCity(){
        return faker.address().city();
    }

    private String setCountry(){
        return faker.address().country();
    }

    private String setPersonalId(){
        return faker.number().digits(9);
    }

    private String getFirstname() {
        return firstname;
    }

    private String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return  email + '\'' + ", " +
                firstname + '\'' + ", " +
                lastname + '\'' + ", " +
                city + '\'' + ", " +
                country + '\'' + ", " +
                personalId;
    }
}
