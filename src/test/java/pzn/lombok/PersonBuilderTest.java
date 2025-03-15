package pzn.lombok;

import org.junit.jupiter.api.Test;
import pzn.lombok.entity.Person;

import java.util.List;

public class PersonBuilderTest {

    @Test
    void testBuilder() {

        Person.PersonBuilder personBuilder = Person.builder()
                .id("123").name("Addien").age(24)
                .hobbies(List.of("Coding", "Gaming", "Reading"));

        Person person = personBuilder.build();
    }

    @Test
    void testBuilderSingular() {

        Person.PersonBuilder personBuilder = Person.builder()
                .id("123").name("Addien").age(24)
                .hobby("Coding").hobby("Gaming").hobby("Reading");

        Person person = personBuilder.build();
    }
}
