package ua.com.alicecompany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.alicecompany.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
