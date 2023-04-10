package utez.edu.mx.adoptame.e4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.adoptame.e4.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {
}
