package rdev.edu.ritualfly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rdev.edu.ritualfly.dao.ExampleDao;
import rdev.edu.ritualfly.domain.Example;

@Service
public class ExampleService {

    @Autowired
    private ExampleDao exampleDao;

    public Example getExampleById(Long id) {
        return exampleDao.findById(id).orElse(null);
    }
}
