package utez.edu.mx.adoptame.e4.service;

import org.springframework.stereotype.Service;
import utez.edu.mx.adoptame.e4.entity.MovementManagement;
import utez.edu.mx.adoptame.e4.repository.MovementManagementRepository;

@Service
public class MovementManagementServiceImpl implements MovementManagementService{

    private final MovementManagementRepository movementManagementRepository;

    public MovementManagementServiceImpl(MovementManagementRepository repository) {
        this.movementManagementRepository = repository;
    }

    @Override
    public void createOrUpdate(MovementManagement movementManagement) {

        movementManagementRepository.save(movementManagement);
    }
}
