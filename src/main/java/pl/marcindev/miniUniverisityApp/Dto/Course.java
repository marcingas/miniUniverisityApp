package pl.marcindev.miniUniverisityApp.Dto;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private long id;
    private String title;
    private Teacher teacher;
    List<Student>students;
}
