package homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Person> hiredPersons;

    public Company() {
        this.hiredPersons = new ArrayList<>();
    }

    public Person getManager() {
        for (Person currentPerson: hiredPersons) {
            if (currentPerson.getPosition().equals("manager")) {
                return currentPerson;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> matches = new ArrayList<>();

        for (Person currentPerson: hiredPersons) {
            if (currentPerson.getPosition().equals(profession)) {
                matches.add(currentPerson);
            }
        }

        return matches;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> matches = new ArrayList<>();

        for (Person currentPerson: hiredPersons) {
            if (currentPerson.getAge() > age) {
                matches.add(currentPerson);
            }
        }

        return matches;

    }

    public List<Person> getPersonByName(String filterName) {
        List<Person> matches = new ArrayList<>();

        for (Person currentPerson: hiredPersons) {
            if (currentPerson.getName().equals(filterName)) {
                matches.add(currentPerson);
            }
        }
        return matches;
    }

    public boolean employ(Person person) {
        return hiredPersons.add(person);
    }
}