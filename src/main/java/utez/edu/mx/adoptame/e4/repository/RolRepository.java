package utez.edu.mx.adoptame.e4.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.adoptame.e4.entity.Role;

@Repository
public interface RolRepository extends JpaRepository<Role, Long> {
    Optional<Role> findRolByName(String name);
}
