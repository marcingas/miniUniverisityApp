package pl.marcindev.miniUniverisityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcindev.miniUniverisityApp.entity.StudentEntity;

@Repository
public interface StudentEntityRepository extends JpaRepository<StudentEntity, Long> {
}
