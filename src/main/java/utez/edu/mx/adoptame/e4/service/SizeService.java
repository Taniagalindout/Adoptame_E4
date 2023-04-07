package utez.edu.mx.adoptame.e4.service;

import utez.edu.mx.adoptame.e4.entity.Size;

import java.util.List;
import java.util.Optional;

public interface SizeService {
    List<Size> findAllSizes();

    Long countAllSizes();

    Optional<Size> findSizeById(Long id);
}
