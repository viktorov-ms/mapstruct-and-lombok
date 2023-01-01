package localhost.mapstructAndLombok.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {

  private Long id;
  private String surname;
  private String name;
}
