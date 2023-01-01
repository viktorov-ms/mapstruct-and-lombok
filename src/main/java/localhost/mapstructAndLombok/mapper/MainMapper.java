package localhost.mapstructAndLombok.mapper;

import localhost.mapstructAndLombok.models.Person;
import localhost.mapstructAndLombok.models.PersonDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MainMapper {

  PersonDto personToPersonDto(Person person);
}
