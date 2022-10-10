package ru.hogwarts.school33.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school33.exception.FacultyNotFoundException;
import ru.hogwarts.school33.exception.StudentNotFoundException;
import ru.hogwarts.school33.model.Student;
import ru.hogwarts.school33.repository.StudentRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student create(Student student) {
        student.setId(null);
        return studentRepository.save(student);

    }

    public Student read(long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student update(long id, Student newStudent) {
        Student oldStudent = read(id);
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setName(newStudent.getName());
        return studentRepository.save(oldStudent);
    }

    public Student delete(long id) {
        Student student = read(id);
        studentRepository.delete(student);
        return student;
    }

    public Collection<Student> findByAge(int age) {
        return studentRepository.findAllByAge(age);
    }
}

