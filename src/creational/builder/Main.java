package creational.builder;

import creational.builder.domain.Person;
import creational.builder.domain.Student;

/**
 * We should use builder pattern when multiple representation of objects are required or when the object creation contains optional parameters
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder("Wanderson", "wandersonxs@xxx.com")
                .address("Rua Saturn")
                .age(45)
                .build();
        System.out.println(person);


//        Student student = new Student.Builder("Alexander", "Univille").age(14).build();

        Student.Builder builder = new Student.Builder("Alexander", "Univille").age(14);
        Student student = new Student(builder);

        System.out.println(student);
    }
}
