package pzn.lombok.entity;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "createEmpty")
@AllArgsConstructor(staticName = "create")
@ToString(exclude = "password")
public class Login {

    @Setter(AccessLevel.PROTECTED)
    private String username;

    @Getter(AccessLevel.PROTECTED)
    private String password;
}
