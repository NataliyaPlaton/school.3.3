package ru.hogwarts.school33.exception;

public class StudentNotFoundException extends RuntimeException{

    private long id;

    public StudentNotFoundException(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}