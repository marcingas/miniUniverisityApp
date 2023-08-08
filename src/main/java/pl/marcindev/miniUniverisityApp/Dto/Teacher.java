package pl.marcindev.miniUniverisityApp.Dto;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private long id;
    private String name;
    private String surname;
    private List<Course> courses;
}
