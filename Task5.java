package StreamTasksMedium;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ali",24),
                new Person("Akif",30),
                new Person("Elcin",47),
                new Person("Fazil",18),
                new Person("Ceyhun",62)
        );

        people.stream().filter(person -> person.age >= 30).forEach(System.out::println);
    }
}
