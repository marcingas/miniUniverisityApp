package pl.marcindev.miniUniverisityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcindev.miniUniverisityApp.entity.CourseEntity;

@Repository
public interface CourseEntityRepository extends JpaRepository<CourseEntity, Long> {
}
