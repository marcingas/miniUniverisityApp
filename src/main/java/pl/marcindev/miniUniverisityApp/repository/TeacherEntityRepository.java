package pl.marcindev.miniUniverisityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcindev.miniUniverisityApp.entity.TeacherEntity;

@Repository
public interface TeacherEntityRepository extends JpaRepository<TeacherEntity, Long> {
}
