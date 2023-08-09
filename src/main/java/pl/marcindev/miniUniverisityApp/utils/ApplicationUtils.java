package pl.marcindev.miniUniverisityApp.utils;

import org.springframework.beans.BeanUtils;
import pl.marcindev.miniUniverisityApp.Dto.Course;
import pl.marcindev.miniUniverisityApp.Dto.Student;
import pl.marcindev.miniUniverisityApp.Dto.Teacher;
import pl.marcindev.miniUniverisityApp.entity.CourseEntity;
import pl.marcindev.miniUniverisityApp.entity.StudentEntity;
import pl.marcindev.miniUniverisityApp.entity.TeacherEntity;

public class ApplicationUtils {
    Student studentEntityToStudent(StudentEntity studentEntity) {
        Student student = new Student();
        BeanUtils.copyProperties(studentEntity, student);
        return student;
    }

    StudentEntity studentToStudentEntity(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(student, studentEntity);
        return studentEntity;
    }

    Teacher TeacherEntityToTeacher(TeacherEntity teacherEntity) {
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherEntity, teacher);
        return teacher;
    }

    TeacherEntity TeacherToTeacherEntity(Teacher teacher) {
        TeacherEntity teacherEntity = new TeacherEntity();
        BeanUtils.copyProperties(teacher, teacherEntity);
        return teacherEntity;
    }

    Course CourseEntityToCourse(CourseEntity courseEntity) {
        Course course = new Course();
        BeanUtils.copyProperties(courseEntity, course);
        return course;
    }

    CourseEntity CourseToCourseEntity(Course course) {
        CourseEntity courseEntity = new CourseEntity();
        BeanUtils.copyProperties(course, courseEntity);
        return courseEntity;
    }
}
