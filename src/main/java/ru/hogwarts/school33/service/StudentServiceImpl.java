package ru.hogwarts.school33.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school33.model.Student;
import ru.hogwarts.school33.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

   @Autowired
       private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
         return studentRepository.save(student);
          }

    @Override
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(long id, Student student) {
                return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
       studentRepository.deleteById(id);

    }

  /*  public Collection<Student> findByAge(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                result.add(student);
            }
        }
        return result;
    }

   */

}
