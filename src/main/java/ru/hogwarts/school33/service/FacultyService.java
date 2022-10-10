package ru.hogwarts.school33.service;

import org.springframework.stereotype.Service;

import ru.hogwarts.school33.exception.FacultyNotFoundException;
import ru.hogwarts.school33.model.Faculty;
import ru.hogwarts.school33.repository.FacultyRepository;


import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty create(Faculty faculty) {
        faculty.setId(null);
        return facultyRepository.save(faculty);

    }

    public Faculty read(long id) {
        return facultyRepository.findById(id).orElseThrow(() -> new FacultyNotFoundException(id));
    }


    public Faculty update(long id, Faculty newFaculty) {
        Faculty oldFaculty = read(id);
        oldFaculty.setColor(newFaculty.getColor());
        oldFaculty.setName(newFaculty.getName());
        return facultyRepository.save(oldFaculty);
    }

    public Faculty delete(long id) {
        Faculty faculty = read(id);
        facultyRepository.delete(faculty);
        return faculty;
    }


    public Collection<Faculty> findByColor(String color) {
        return facultyRepository.findAllByColor(color);
    }
}



