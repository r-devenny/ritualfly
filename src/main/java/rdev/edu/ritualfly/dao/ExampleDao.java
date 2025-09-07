package rdev.edu.ritualfly.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rdev.edu.ritualfly.domain.Example;

@Repository
public interface ExampleDao extends JpaRepository<Example, Long> {

}
