package rdev.edu.ritualfly.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rdev.edu.ritualfly.domain.Example;
import rdev.edu.ritualfly.service.ExampleService;

@RestController
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/hello")
    public Example hello() {
        return exampleService.getExampleById(1L);
    }

}
