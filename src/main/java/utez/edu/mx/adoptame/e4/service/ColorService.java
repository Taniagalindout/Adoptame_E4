package utez.edu.mx.adoptame.e4.service;

import utez.edu.mx.adoptame.e4.entity.Color;

import java.util.List;
import java.util.Optional;

public interface ColorService {
    List<Color> findAllColors();

    Long countAllColors();

    Optional<Color> findColorById(Long id);
}
