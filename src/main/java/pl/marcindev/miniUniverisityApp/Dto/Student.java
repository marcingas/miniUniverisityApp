package pl.marcindev.miniUniverisityApp.Dto;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private Long id;
    private String name;
    private String lastName;
    List<Course>courses;
}
