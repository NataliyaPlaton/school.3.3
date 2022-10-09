package ru.hogwarts.school33.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school33.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
