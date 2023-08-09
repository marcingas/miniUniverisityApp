package pl.marcindev.miniUniverisityApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table(name = "teacher")
@Entity
public class TeacherEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(mappedBy = "teacher")
    private List<CourseEntity> courses;

}
