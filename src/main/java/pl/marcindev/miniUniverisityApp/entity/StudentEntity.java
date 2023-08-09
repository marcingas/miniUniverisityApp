package pl.marcindev.miniUniverisityApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "student")
@Entity
@Data
public class StudentEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @ManyToMany(mappedBy = "students")
    List<CourseEntity> courses;
}
