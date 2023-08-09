package pl.marcindev.miniUniverisityApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "course")
@Entity
@Data
public class CourseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private TeacherEntity teacher;
    @ManyToMany
    @JoinTable(name = "course_student",joinColumns = @JoinColumn(name = "course_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    List<StudentEntity> students;
}
