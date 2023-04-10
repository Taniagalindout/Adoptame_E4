package utez.edu.mx.adoptame.e4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.adoptame.e4.entity.Personality;

@Repository
public interface PersonalityRepository extends JpaRepository<Personality, Long> {
}
