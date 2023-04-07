package utez.edu.mx.adoptame.e4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.adoptame.e4.entity.MovementManagement;

@Repository
public interface MovementManagementRepository extends JpaRepository<MovementManagement, Long> {
}
