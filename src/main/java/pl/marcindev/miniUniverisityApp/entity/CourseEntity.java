package pl.marcindev.miniUniverisityApp.entity;

import pl.marcindev.miniUniverisityApp.Dto.Teacher;

import java.util.List;

public class CourseEntity {
    private long id;
    private String title;
    private TeacherEntity teacher;
    List<StudentEntity>students;
}
