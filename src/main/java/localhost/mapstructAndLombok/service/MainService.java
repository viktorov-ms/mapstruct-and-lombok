package localhost.mapstructAndLombok.service;

import localhost.mapstructAndLombok.mapper.MainMapper;
import localhost.mapstructAndLombok.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainService {

  private final MainMapper mapper;

  public String index() {
    return mapper.personToPersonDto(Person.builder()
        .id(1L)
        .name("Иван")
        .surname("Иванов")
        .build()).toString();
  }
}
