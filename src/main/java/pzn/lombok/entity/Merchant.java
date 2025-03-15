package pzn.lombok.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Merchant {

    private final String id;

    private String name;
}
