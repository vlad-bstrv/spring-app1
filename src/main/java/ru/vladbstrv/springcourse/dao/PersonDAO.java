package ru.vladbstrv.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.vladbstrv.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "John"));
        people.add(new Person(2, "Sergey"));
        people.add(new Person(3, "Olga"));
        people.add(new Person(4, "Petr"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
