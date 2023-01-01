package localhost.mapstructAndLombok.models;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class PersonDto {

  private String surname;
  private String name;
}
