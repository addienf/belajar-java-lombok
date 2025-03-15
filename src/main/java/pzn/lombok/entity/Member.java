package pzn.lombok.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {

    @NonNull
    private String id;

    @NonNull
    private String name;

}
