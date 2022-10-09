package ru.hogwarts.school33.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school33.model.Faculty;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
