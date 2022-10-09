package ru.hogwarts.school33.service;


import ru.hogwarts.school33.model.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(long id, Faculty faculty);

    void deleteFaculty(long id);

 // Collection<Faculty> findByColor(String color);



}
