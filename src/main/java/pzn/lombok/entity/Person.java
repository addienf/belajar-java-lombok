package pzn.lombok.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Person {

    private String id;

    private String name;

    private Integer age;

    @Singular
    private List<String> hobbies;

}
