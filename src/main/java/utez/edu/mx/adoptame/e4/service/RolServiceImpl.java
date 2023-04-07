package utez.edu.mx.adoptame.e4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import utez.edu.mx.adoptame.e4.entity.Role;
import utez.edu.mx.adoptame.e4.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    @Override
    @Transactional
    public List<Role> findAllRol() {
        return  rolRepository.findAll();
    }
}
