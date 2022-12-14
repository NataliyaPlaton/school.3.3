package ru.hogwarts.school33.service;


import ru.hogwarts.school33.model.Student;

import java.util.Collection;

public interface StudentService {

    Student addStudent(Student student);

    Student findStudent(long id);

    Student editStudent(long id, Student student);

    void deleteStudent(long id);

 //   Collection<Student> findByAge(int age);
}
