package pl.marcindev.miniUniverisityApp.entity;

import pl.marcindev.miniUniverisityApp.Dto.Course;
import pl.marcindev.miniUniverisityApp.Dto.Student;

import java.util.List;

public class StudentEntity {
    private long id;
    private String name;
    private String surname;
    List<CourseEntity>courses;
}
