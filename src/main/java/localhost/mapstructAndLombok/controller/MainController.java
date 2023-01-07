package localhost.mapstructAndLombok.controller;

import localhost.mapstructAndLombok.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

  private final MainService service;

  @GetMapping("/")
  public String index() {
    return service.index();
  }
}
